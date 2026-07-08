package Java.Collections.Set.Practice;

import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();   // Creating an empty HashSet of string entities

        hs.add("John");                     // Adding elements using add() method
        hs.add("Sam");
        hs.add("Bob");

        System.out.println("HashSet : " + hs);
        
        hs.remove("Bob");   // Removing the element Bob
        System.out.println("HashSet after removing element : " + hs);       // updated HashSet elements

        System.out.println("Bob exists in Set : " + hs.remove("Bob"));  // Returns false if the element is not present

        
        System.out.print("Using iterator : ");  // Using iterator() method to iterate Over the HashSet
        Iterator<String> iterator = hs.iterator();

        while (iterator.hasNext())                      // Traversing HashSet
            System.out.print(iterator.next() + ", ");

        System.out.println();
        System.out.print("Using enhanced for loop : ");     // Using enhanced for loop to iterate Over the HashSet
        for (String element : hs)
            System.out.print(element + " , ");
    }
}
