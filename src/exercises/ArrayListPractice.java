package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(5);
        ints.add(8);
        ints.add(13);
        ints.add(21);
        ints.add(34);
        ints.add(55);

        ArrayList<Integer> evens = new ArrayList<>();
        int sum = 0;

        for (int i=0; i<ints.size();i++) {
            if (ints.get(i) % 2 == 0) {
                evens.add(ints.get(i));
                sum += ints.get(i);
            }
        };

//        System.out.println(evens);
        System.out.println(sum);

        ArrayList<String> words = new ArrayList<>();
        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox.\n" +
        "I will not eat them in a house. I will not eat them with a mouse.";
        String delims = "[ ,.]";
        String[] drSeussSplit = drSeuss.split(delims);
        System.out.println(Arrays.toString(drSeussSplit));

        List<String> drSeussList = new ArrayList<>();
        drSeussList = Arrays.asList(drSeussSplit);
        System.out.println(drSeussList);

        Scanner input = new Scanner(System.in);
        System.out.println("How many letters would you like to search?");
        int numLetters = input.nextInt();

        for(int i=0;i<drSeussList.size();i++){
            if(drSeussList.get(i).length()==numLetters) {
                System.out.println(drSeussList.get(i));
            }
        }
    }
}