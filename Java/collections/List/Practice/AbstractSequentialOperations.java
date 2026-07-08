package Java.Collections.List.Practice;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSequentialOperations {
    public static void main(String[] args) {
        // Creating an empty AbstractSequentialList
        AbstractSequentialList<String> a = new LinkedList<String>();

        a.add("Geeks");     // Using add() method to add elements
        a.add("for");
        a.add("Geeks");
        a.add("10");
        a.add("20");

        System.out.println("AbstractSequentialList: " + a);     // Output the list
        a.remove(3);                            // Remove the head using remove()

        System.out.println("Final List: " + a);     // Print the final list

        // Fetching the specific element from the list using get() method
        System.out.println("The element is: " + a.get(2));
    }
}
