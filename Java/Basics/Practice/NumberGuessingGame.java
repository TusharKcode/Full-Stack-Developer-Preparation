package Practice;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessTheNumber(){
        Scanner scn = new Scanner(System.in);
                            // Generate a random number between 1 to 100
        int number = 1 + (int) (100 * Math.random());
        int attempts = 0;   // Track no. of attempts
        int K = 5;          // Number of attempts
        boolean guessedCorrectly = false;

        System.out.println("A number is chosen between 1 to 100.");
        System.out.println("You have " + K + " attempts per round to guess the correct number.");

        while (!guessedCorrectly) {    
            for (int i = 0; i < K; i++) {
                System.out.println("Enter your guess: ");
                int guess = scn.nextInt();
                attempts++;
    
                if(guess == number){
                    System.out.println("Congratulations! You guessed the correct number in "
                        + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (guess < number){
                    System.out.println("The number is greater than " + guess);
                } else {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You have used all " + K + " attempts.");
                System.out.println("Do you want to continue guessing? (yes/no): ");
                String response = scn.next();

                if(!response.equalsIgnoreCase("yes")){
                    System.out.println("Game Over! The correct number was: " + number);
                }
            }
        }
        scn.close();
    }
    public static void main(String[] args) {
        guessTheNumber();
    }
    
}
