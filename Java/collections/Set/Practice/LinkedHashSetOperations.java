package Java.Collections.Set.Practice;

import java.util.*;

public class LinkedHashSetOperations {
    public static void main(String[] args) {
        
        LinkedHashSet<String> lh = new LinkedHashSet<String>(); // Creating an empty LinkedHashSet

        lh.add("Hello"); // Adding elements to above Set using add() method
        lh.add("Hi");
        lh.add("Hey");

        System.out.println("LinkedHashSet : " + lh);

        lh.add("A");
        lh.add("B");
        lh.add("Z");

        System.out.println("" + lh);

        lh.remove("B");                             // Removing the element from above Set
        System.out.println("After removing element " + lh); // Again removing the element
        System.out.println(lh.remove("AC"));    // Returning false if the element is not present

        Iterator<String> itr = lh.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

        System.out.println();

        for (String s : lh)
            System.out.print(s + ", ");
        System.out.println();
    }
}
