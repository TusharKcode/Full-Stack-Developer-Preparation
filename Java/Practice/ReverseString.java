import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scRev = new Scanner(System.in);
        System.out.println("Enter a String to resverse: ");

        String userInput = scRev.nextLine();

        String revStr = "";

        int length = userInput.length();

        for (int i = length - 1; i >= 0; i--) {
            revStr += userInput.charAt(i);
        }

        System.out.println("User Input String: " + userInput);
        System.out.println("String to reeverse: " + revStr);

        scRev.close();
    }
}
