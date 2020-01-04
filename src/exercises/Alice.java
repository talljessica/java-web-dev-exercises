package exercises;

import java.util.Scanner;

public class Alice {
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

        Boolean searchResult = aliceStr.toLowerCase().contains(term.toLowerCase());
//        return true if aliceStr contains term searched case insensitive
        if (searchResult) {
            System.out.println("First sentence in 'Alice in Wonderland' contains " + term + ".");
        } else {
            System.out.println("First sentence in 'Alice in Wonderland' does not contain " + term + ".");
        }
    }
}
