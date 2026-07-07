package Java.Collections.Interfaces.Practice;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        System.out.println("Set Interface");

        System.out.println("------ Adding elements ------");

        Set<String> elements = new HashSet<>();
        elements.add("A");
        elements.add("B");
        elements.add("C");
        elements.add("D");
        elements.add("E");
        System.out.println("After adding elements in Set: " + elements);

        System.out.println("");

        System.out.println("------ Accessing elements ------");
        System.out.println("Set contains A: " + elements.contains("A"));
        System.out.println("Set contains B: " + elements.contains("B"));
        System.out.println("Set contains C: " + elements.contains("C"));
        System.out.println("Set contains D: " + elements.contains("D"));
        System.out.println("Set contains E: " + elements.contains("E"));
        System.out.println("Set contains F: " + elements.contains("F"));
        
        System.out.println("");

        System.out.println("------ Removing elements ------");
        elements.remove("E");
        System.out.println("After removing element Set is: " + elements);
        System.out.println("");

        System.out.println("------ Iterating elements ------");
        for(String str : elements){
            System.out.println(str + ", ");
        }
        System.out.println("");
    }
}
