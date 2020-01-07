package exercises;

import java.util.ArrayList;
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
    }
}