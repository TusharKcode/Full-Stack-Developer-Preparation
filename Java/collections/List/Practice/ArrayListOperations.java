package Java.Collections.List.Practice;

import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        System.out.println("Array List Methods");

        System.out.println("------- Adding elements -------");
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Red");
        elements.add("Blue");
        elements.add("Green");
        elements.add("Orange");
        System.out.println("Original List: " + elements);
        System.out.println("");

        System.out.println("------- Removing elements -------");
        System.out.println("Remove element using index 0: " + elements.remove(0));
        System.out.println("Remove element using value: " + elements.remove("Green"));
        System.out.println("Updated List: " + elements);
        System.out.println("");

        System.out.println("------- Updating elements -------");
        System.out.println("Updating element at index 0: " + elements.set(0, "White"));
        System.out.println("Array List is: " + elements);
        System.out.println("");
    }
}
