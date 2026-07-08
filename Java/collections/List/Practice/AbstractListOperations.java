package Java.Collections.List.Practice;

import java.util.AbstractList;
import java.util.LinkedList;

public class AbstractListOperations {
    public static void main(String[] args) {
        AbstractList<String> list = new LinkedList<String>(); // Creating an empty AbstractList 

        list.add("John");  // Using add() method to add elements in the list 
        list.add("Bob"); 
        list.add("Tom"); 
        list.add("10"); 
        list.add("20"); 

        System.out.println("AbstractList: " + list);            // Output the list 
        
        list.remove(3);                                   // Remove the head using remove() 
        System.out.println("Final AbstractList: " + list);      // Print the final list 

        // getting the index of last occurrence using lastIndexOf() method 
        int lastIndex = list.lastIndexOf("A"); 
        System.out.println("Last index of A : " + lastIndex);   // printing the Index 
    }
}
