package Practice;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Printing String with Variable: ");
        String msg = "Hello String";
        System.out.println(msg);
        
        System.out.println(" ");
    
        System.out.println("Printing String with Concatenation: ");
        System.out.println(msg + "... with concatenating");

        System.out.println(" ");

        // Same with any number of strings
        System.out.println("Concatenation by multiple values: ");
        String start = "My name is ";
        String end = ", James Bond";
        System.out.println(start + "Bond" + end);

        System.out.println(" ");

        // Reading user input
        System.out.println("Reading input: ");
        Scanner readingInp = new Scanner(System.in);

        System.out.println("------- A message by the user -------");
        String userMsg = readingInp.nextLine();
        System.out.println(userMsg);
        
        // Reading multiple user input
        System.out.println("------- Messages by the user -------");
        System.out.println("Write the first string:");
        String first = readingInp.nextLine();
        System.out.println("Write the second string:");
        String second = readingInp.nextLine();
        System.out.println("Write the third string:");
        String third = readingInp.nextLine();

        System.out.println("You wrote:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println("Message by User: " + first + second + third);

        readingInp.close();
    }
}

