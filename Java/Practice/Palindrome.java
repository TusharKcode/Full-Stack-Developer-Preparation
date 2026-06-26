// A palindrome is a number, string or any data value, which reads the same from backwards. 
// i.e. If we reverse a value and compare it with its original value, the result should be true.

// Example: If user input "madam"
//      ->    i is at "m" and j is at "m", (If True means beginning and ending character are same)
//      ->    i moves to "a" and j moves to "a"
//      ->    i and j meets at "d", matched (If not matched, notPalindrome = 1, then break)
//      ->    loop finishes, prints "It is Palindrome"

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String palindromeStr;
        int notPalindrome = 0;
        System.out.println("Enter String to check Palindrome: ");

        Scanner scnPal = new Scanner(System.in);
        palindromeStr = scnPal.nextLine();

        int i, j;
        i = 0;
        j = palindromeStr.length() - 1;

        while (i <= j) {   
            if(palindromeStr.charAt(i) != palindromeStr.charAt(j)){
                notPalindrome = 1;
                break;
            }
            i++;
            j--;
        }

        if (notPalindrome != 1) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }

        scnPal.close();
    }   
}
