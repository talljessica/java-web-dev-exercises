package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Integer mls = input.nextInt();
        System.out.println("How many gallons of gas have you consumed?");
        Integer gas = input.nextInt();
        input.close();
        Integer miles_per_gallon = mls/gas;
        System.out.println("You have used "+miles_per_gallon+" miles per gallon.");
    }
}
