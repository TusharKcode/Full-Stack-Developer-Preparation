package Practice;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner userInp = new Scanner(System.in);

        System.out.println("Chicken:");
        int quantity = userInp.nextInt();

        System.out.println("Bacon (kg):");
        double nonVegQuantity = userInp.nextDouble();
        
        System.out.println("Tractor: ");
        userInp.nextLine();
        String vehicleName = userInp.nextLine();

        System.out.println("And finally, a summary: ");
        System.out.println("Quantity of Chickens: " + quantity);
        System.out.println("Quantity of Bacon (kg): " + nonVegQuantity);
        System.out.println("Vehicle Name: " + vehicleName);

        
        double pi = 3.14;
        // double pi = 3.141592653;    // error: duplicate local variable
        System.out.println("The value of pi is: " + pi);

        // converts a string to an integer
        System.out.println("------ Converting string to integer ------");
        String valueAsString = "42";
        int valueInt = Integer.valueOf(valueAsString);
        System.out.println(valueInt);
        
        // converts a string to an integer
        System.out.println("------ Converting string to double ------");
        String valueDoubleAsString = "42.42";
        double valueDouble = Double.valueOf(valueDoubleAsString);
        System.out.println(valueDouble);
        
        System.out.println("------ Converting string to boolean ------");
        System.out.println("Write a boolean ");
        boolean value = Boolean.valueOf(userInp.nextLine());
        System.out.println("You wrote " + value);
        
        userInp.close();
    }
}
