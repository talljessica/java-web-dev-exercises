package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newID;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newID = input.nextInt();
//


            if (newID != 0) {
                System.out.print("Student Name: ");
                String newName;
                newName = input.nextLine();
                students.put(newID, newName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(0 != newID);

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + student.getValue());
            System.out.println(student.getValue());


        }


    }
}

