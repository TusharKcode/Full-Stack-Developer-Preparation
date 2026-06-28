package Practice;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {

        // Create a tool for reading user input and name it scanner
        Scanner scn = new Scanner(System.in);

        // Print "Write a message: "
        System.out.println("Writing a message: ");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String message = scn.nextLine();
        
        // Print the message written by the user
        System.out.println("Reading input: " + message);
        scn.close();
    }
}
