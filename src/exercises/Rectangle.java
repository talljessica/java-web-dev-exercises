package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        Integer length = input.nextInt();
        System.out.println("Enter width of rectangle:");
        Integer width = input.nextInt();
        input.close();
        Integer area = length*width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
