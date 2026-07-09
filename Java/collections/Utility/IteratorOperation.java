package Java.Collections.Utility;

import java.util.*;

public class IteratorOperation {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();   // Creating an ArrayList of Integer type
        for (int i = 0; i < 10; i++) {      // Adding elements to the ArrayList
            al.add(i);
        }
        System.out.println("Original List: " + al);     // Printing the original list

        Iterator<Integer> itr = al.iterator();  // Creating an Iterator for the ArrayList
        while (itr.hasNext()) {     // Iterating through the list and removing odd elements
            int i = itr.next();     // Getting the next element
            System.out.print(i + " ");
            if (i % 2 != 0) {       // Removing odd elements
                itr.remove();
            }
        }
        System.out.println();

        System.out.println("Modified List: " + al); // Printing the modified list after removal of odd elements
    }
}
