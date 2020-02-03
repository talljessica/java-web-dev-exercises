package org.launchcode.java.studios.quizzie;

import java.util.*;

public class Quiz {

    private List<Question> questionList;
    private double score = 0;

    public Quiz(List<Question> questionList, double score) {
        this.questionList = questionList;
        this.score = score;
    }

    ///this shuffles answers before assigning them an integer
    public String[] shuffleList(String[] a){
        List<String> tempList = Arrays.asList(a);
        Collections.shuffle(tempList);
        a = tempList.toArray(new String[tempList.size()]);
        return a;
    }

    //assigns integer key to each answer choice
    public Map<Integer, String> assignA(String[] a){
        Map<Integer, String> aMap = new HashMap<>();
        int l = a.length;
        String[] shuffledA = shuffleList(a);
        for (int i=0; i < l; i++){
            aMap.put(i+1, shuffledA[i]);
        }
        return aMap;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
