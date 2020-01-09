package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();

//        do {
//            if (radius <= 0) {
//                System.out.println("Please enter valid radius!");
//                break;
//            }
//        }while (true);
        input.close();

//        if (input != double){
//            System.out.println("Invalid radius");
//        }else{

//        double pi = 3.14;
//        double areaOfCircle = 3.14*radius*radius;
            Double areaOfCircle = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
        }
    }
//}
