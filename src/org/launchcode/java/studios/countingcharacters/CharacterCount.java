package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;


public class CharacterCount {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has \n" +
                "to be zero to start with. So if you move all the terms over to one side, you can put the \n" +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. \n" +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = quote.toCharArray();

        HashMap<Character, Integer> charCount = countCharacters(charactersInString);

        for (Character c : charCount.keySet()) {
            System.out.println(c + ": " + charCount.get(c));

        }
    }

        private static HashMap<Character, Integer> countCharacters(char[] inputStr){
                HashMap<Character, Integer> count = new HashMap<>();

                for (Character c : inputStr) {
                    if (!count.containsKey(c)) {
                        count.put(c, 1);
                    } else {
                        Integer currentCount = count.get(c);
                        currentCount++;
                        count.put(c, currentCount);
                    }
                }
                return count;
            }
        }


