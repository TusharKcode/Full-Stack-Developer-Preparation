package Java.Collections.Interfaces.Practice;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        System.out.println("List Operations");

        System.out.println("-------- Adding Elements --------");
        List<String> element = new ArrayList<>();
        element.add("Red");
        element.add("Blue");
        element.add("Green");
        element.add(1, "Yellow");
        System.out.println("After Adding elements: " + element);
        System.out.println("");

        System.out.println("-------- Updating Elements --------");
        System.out.println("Initial List elements: " + element);

        element.set(1, "Pink");
        System.out.println("After Updating elements: " + element);
        System.out.println("");

        System.out.println("-------- Searching Elements --------");

        element.add(1, "Green");
        System.out.println("After Adding elements: " + element);
        System.out.println("First Occurrence of at Index: " + element.indexOf("Green"));
        System.out.println("Last Occurrence of at Index: " + element.lastIndexOf("Green"));

        System.out.println("");

        System.out.println("-------- Removing Elements --------");

        System.out.println("Initial List elements: " + element);
        System.out.println("Before Removing element Green at Index of: " + element.indexOf("Green"));
        
        element.remove(1);  // Now remove element from the above list present at 1st index
        System.out.println("After removing Green from List at index of: " + element.indexOf("Green"));
        System.out.println("Remove the current object from the updated List: " + element.remove("Green"));

        System.out.println("Updated List elements: " + element);
        System.out.println("");

        System.out.println("-------- Accessing Elements --------");

        System.out.println("Updated List elements: " + element);
        // Accessing elements using get() method

        System.out.println("Accessing element at Index 0: " + element.get(0));
        System.out.println("Accessing element at Index 1: " + element.get(1));
        System.out.println("Accessing element at Index 2: " + element.get(2));

        System.out.println("");

        System.out.println("-------- Checking if an element is present or not --------");

        System.out.println("Updated List elements: " + element);
        System.out.println("Is Pink present in the list? " + element.contains("Pink"));
        System.out.println("Is Yellow present in the list? " + element.contains("Yellow"));

        System.out.println("");
        System.out.println("------ Iterating over List Interface in Java ------");
        System.out.println("Using for Loop\n");
        for(int i = 0; i < element.size(); i++){
            System.out.println(element.get(i) + " ");
        }

        System.out.println("\nUsing for-each Loop\n");
        for(String str : element){
            System.out.println(str +  " ");
        }
    }
}
