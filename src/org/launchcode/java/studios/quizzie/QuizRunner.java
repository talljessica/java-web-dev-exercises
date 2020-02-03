package org.launchcode.java.studios.quizzie;

import java.util.*;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {

        List<Question> questionList = new ArrayList<>();

        questionList.add(
                new MultipleChoice("Which cocktail's ingredients include 2 oz of rye whiskey, 1 oz of sweet vermouth, and 2 dashes of bitters, 212? Getting it's name from the city's area code it is named after.",
                        new String[]{ "Manhattan", "Cosmopolitan", "White Russian", "Margarita" },
                        new String[]{ "Manhattan" }));

        questionList.add(
                new MultipleChoice("What juice added to a Martini makes it 'Dirty'?",
                        new String[]{ "Orange", "Cranberry", "Olive", "Potato" },
                        new String[]{ "Olive" }));

        questionList.add(
                new MultipleChoice("Which cocktail is 'The Big Lebowski' The Dude's favorite?",
                        new String[]{ "Long Island Iced Tea", "White Russian", "Daquiri", "Old Fashion" },
                        new String[]{ "White Russian"}));

        questionList.add(
                new MultipleChoice("What year was Prohibition repealed in the United States?",
                        new String[]{ "1933", "1990", "1833", "1953" },
                        new String[]{ "1933" }));

        questionList.add(
                new Checkbox("The Old Fashion cocktail traditionally contains whiskey and what two other ingredients?",
                        new String[]{ "Maple Syrup", "Sugar", "Coke", "Bitters" },
                        new String[]{ "Sugar", "Bitters"}));

        questionList.add(
                new Checkbox("A Moscow Mule is traditionally served in what type of metal cup?",
                         new String[]{ "Tin", "Copper", "Gold", "Aluminum" },
                        new String[]{ "Copper" }));

        questionList.add(
                new Checkbox("Which of the following are Johnny Walker Scotch Whiskeys? Select all that apply.",
                        new String[]{ "Purple Label", "Red Label", "Blue Label", "Black Label" },
                        new String[]{ "Red Label", "Blue Label", "Black Label"}));

        questionList.add(
                new Checkbox("Which actor/movie pairs are correct?",
                        new String[]{ "Tom Cruise/Cocktail", "Tom Arnold/Cocktail", "Tyra Banks/Coyote Ugly", "Elizabeth Banks/Coyote Ugly" },
                        new String[]{ "Tom Cruise/Cocktail", "Tyra Banks/Coyote Ugly"}));

        questionList.add(
                new TrueOrFalse("'Margaritaville' is a 1977 song by American singer-songwriter Jimmy Buffet. True or False.",
                        new String[]{ "True", "False" },
                        new String[]{ "True" }));

        questionList.add(
                new TrueOrFalse("The definition of a mixologist is 'a scientist who studies life, specifically organisms and their relationship to their environment.' True or False." ,
                        new String[]{ "True", "False" },
                        new String[]{ "False" }));

        questionList.add(
                new TrueOrFalse("In bartending, the term 'neat' refers to a single liquor drink that hasn't been chilled or served with any water, ice, or other mixer. True or False.",
                        new String[]{ "True", "False" },
                        new String[]{ "True" }));

        questionList.add(
                new TrueOrFalse("A 'bomb' shot is a shot that energy drink has been added to. True or False.",
                        new String[]{ "True", "False" },
                        new String[]{ "True" }));

        Collections.shuffle(questionList);

    Quiz quiz = new Quiz(questionList, 0);

    //Run quiz
    Scanner input = new Scanner(System.in);

    System.out.println("MY COCKTAIL QUIZ");

    //Give questions one at a time

    int i;
    String inquire;
    String[] answersList;
    List<String> correctA;
    int correct;
    double increment = 0;
    double questionScore = 0;
    int response =0;
    double totalAsked = 0;


    for (i=0; i<questionList.size();i++) {
        inquire = questionList.get(i).getQ(); //gives questions
        answersList = questionList.get(i).getA(); //presents answers
        correctA = Arrays.asList(questionList.get(i).getCorrectA()); //gets correct answer
        correct = questionList.get(i).getCorrectA().length; //when there is more than one correct answer(checkbox)
        increment = 1.0/ correct; //adds points for each correct answers

        Map<Integer, String> aMap = quiz.assignA(answersList);

        System.out.println("Question " + i+1);
        System.out.println(inquire);

        //Answers to choose from with assigned integer
        for(Map.Entry<Integer, String> a: aMap.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue() + "\n");
        }

        for(int n =0; n < correct; n++) {
            while (response == 0 || response > answersList.length) {
                String userInput = input.nextLine();
                if(userInput.equals("")) {
                    System.out.println("Please enter a number from above.");
                }else if (userInput.matches("[0-9]?")) {
                    response = Integer.parseInt(userInput);
                    if (response == 0 || response > answersList.length) {
                        System.out.println("Your answer must be one of the numbered choices above.");
                    }
                }else{
                    System.out.println("Try again.");
                }
            }
            if (correctA.contains(aMap.get(response))) {
                questionScore += increment;
            }
            response = 0;
        }
        quiz.setScore(quiz.getScore() + questionScore);
        System.out.println();

        totalAsked = i+1.0;

        if(questionScore == 1){
            System.out.println("Correct! You get a point added to your score.");
        }else if (questionScore == 0) {
            System.out.println("Not correct, no points for you!");
            System.out.println("The correct answer is " + correctA);
        }else{
            System.out.println("Not completely correct, you get a partial point.");
            System.out.println("The correct answer is " + correctA);
        }
        System.out.println("Your current score is " + (Math.round(10.0 * quiz.getScore()) / 10.0) + " out of " + totalAsked + ".");

        questionScore = 0;
    }

    input.close();

    //grade report

        double grade = Math.round(10.0 * 100 * quiz.getScore() / totalAsked / 10.0);

        System.out.println("Congrats! You completed the quiz. Your final score is " + grade + ".");
}}
