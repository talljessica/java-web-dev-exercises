package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] values = {1, 1, 2, 3, 5, 8};

        for (int value : values)
            if (value % 2 != 0) {
                System.out.println(value);
            }

        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox.\n" +
                "I will not eat them in a house. I will not eat them with a mouse.";
//            String[] newDrSeuss = drSeuss.split(" ");
//        String split by spaces
            String[] newDrSeuss = drSeuss.split("\\.");
//            String split by sentences
        System.out.println(Arrays.toString(newDrSeuss));
    }
}
