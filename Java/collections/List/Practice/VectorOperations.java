package Java.Collections.List.Practice;

import java.util.*;

public class VectorOperations {
    public static void main(String[] args) {
        // Creating a default vector
        Vector v1 = new Vector();

        // Adding custom elements using add() method
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);

        System.out.println("Vector v1 is " + v1);

        // Creating generic vector
        Vector<Integer> v2 = new Vector<Integer>();

        // Adding custom elements using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);
        
        System.out.println("Vector v2 is " + v2);

         // Creating an empty Vector 
        Vector<Integer> v = new Vector<Integer>(); 

        // Use add() method to add elements in the vector 
        v.add(12); 
        v.add(23); 
        v.add(22); 
        v.add(10); 
        v.add(20); 

        // Displaying the Vector 
        System.out.println("Vector: " + v); 

        // Using set() method to replace 12 with 21 
        System.out.println("The Object that is replaced is: "
                        + v.set(0, 21)); 

        // Using set() method to replace 20 with 50 
        System.out.println("The Object that is replaced is: "
                        + v.set(4, 50)); 

        System.out.println("The new Vector is:" + v);

        // Removing first occurrence element at 1
        v.remove(1);

        System.out.println("After removal: " + v);

        // Using the Get method and the for loop
        for (int i = 0; i < v.size(); i++) {

            System.out.print(v.get(i) + " ");
        }

        System.out.println();

        for (Integer str : v)
            System.out.print(str + " ");
    }
}
