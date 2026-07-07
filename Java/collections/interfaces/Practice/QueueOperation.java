package Java.Collections.Interfaces.Practice;

import java.util.*;

public class QueueOperation {
    public static void main(String[] args) {
        System.out.println("Queue Interface");

        System.out.println("------ Adding element ------");
        Queue<String> elements = new PriorityQueue<>();
        elements.add("Earth");
        elements.add("Air");
        elements.add("Mountains");
        elements.add("Ox");
        elements.add("Soil");
        System.out.println("After Adding elements to queue: " + elements);
        
        System.out.println("");

        System.out.println("------ Removing element ------");
        System.out.println("Initial elements in queue: " + elements);
        elements.remove("Earth");
        System.out.println("After removing one element: " + elements);
        System.out.println("Removing first (head) element from queue: " + elements.poll());
        
        System.out.println("");

        System.out.println("------ Accessing element ------");
        System.out.println("Accessing Head element using element: " + elements.peek());
        System.out.println("Accessing Head element using element: " + elements.element());

        System.out.println("");

        System.out.println("------ Iterating element ------");
        Iterator<String> eleQueue = elements.iterator();
        while (eleQueue.hasNext()) {
            System.out.println(eleQueue.next());
        }
        System.out.println("");
    }
}
