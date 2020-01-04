package exercises;

import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args) {
        String aliceStr = "Alice was beginning to get very tired of sitting by her sister on the\n" +
                "bank, and of having nothing to do: once or twice she had peeped into the\n" +
                "book her sister was reading, but it had no pictures or conversations in\n" +
                "it, 'and what is the use of a book,' thought Alice 'without pictures or\n" +
                "conversation?'\n";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter term to search for in 'Alice In Wonderland' first sentence: ");
        String term = input.nextLine();
        input.close();

        System.out.println(aliceStr.toLowerCase().indexOf(term));
        System.out.println(term.length());

        String newAliceStr = aliceStr.toLowerCase().replaceAll(term, "");
        System.out.println(newAliceStr);
    }
}
