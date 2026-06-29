package Practice;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessTheNumber(){
        Scanner scn = new Scanner(System.in);
                            // Generate a random number between 1 to 100
        int number = 1 + (int) (100 * Math.random());
        int K = 5;          // Number of attempts

        System.out.println("A number is chosen between 1 to 100.");
        System.out.println("You have " + K + " number of attempts.");

        for (int i = 0; i < K; i++) {
            System.out.println("Enter your guess: ");
            int guess = scn.nextInt();

            if(guess == number){
                System.out.println("Congrats! You guessed the correct number.");
                scn.close();
                return;
            } else if (guess < number){
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess);
            }
        }
        System.out.println("You have exhausted all your attempts. The  correct number was: " + number);
        scn.close();
    }
    public static void main(String[] args) {
        guessTheNumber();
    }
    
}
