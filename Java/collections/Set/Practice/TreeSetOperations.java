package Java.Collections.Set.Practice;

import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {        
        Set<String> ts = new TreeSet<>();   // Creating a Set interface with reference to TreeSet class

        ts.add("Geek"); // Elements are added using add() method
        ts.add("For");
        ts.add("Geeks");

        System.out.println(ts); // Print all elements inside object

        NavigableSet<String> ts1 = new TreeSet<>();

        // Elements are added using add() method
        ts1.add("Geek");
        ts1.add("For");
        ts1.add("Geeks");

        System.out.println("Tree Set is " + ts1);
        String check = "Geeks";

         // Check if the above string exists in the tree set or not
        System.out.println("Contains " + ts1.contains(check));

        // Print the first element in the TreeSet
        System.out.println("First Value " + ts1.first());

        // Print the last element in the TreeSet
        System.out.println("Last Value " + ts1.last());

        // Now removing the first element using pollFirst()
        // method
        ts1.pollFirst();

        // Again printing the updated TreeSet
        System.out.println("After removing first " + ts1);

        // Removing the last element using pollLast() method
        ts1.pollLast();

        System.out.println("After removing last " + ts1);

        for (String value : ts)
            System.out.print(value + ", ");

        System.out.println();
    }
}