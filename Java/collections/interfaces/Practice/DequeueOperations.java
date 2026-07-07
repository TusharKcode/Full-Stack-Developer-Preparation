package Java.Collections.Interfaces.Practice;

import java.util.*;

public class DequeueOperations {
    public static void main(String[] args) {
        System.out.println("Dequeue Interface");

        System.out.println("------ Adding element ------");
        Deque<String> elements = new ArrayDeque<>();
        elements.add("Earth");
        elements.addFirst("Air");
        elements.add("Water");
        elements.addLast("Mountains");

        System.out.println("After Adding elements to dequeue: " + elements);
        
        System.out.println("");

        System.out.println("------ Removing element ------");
        System.out.println("Initial elements in dequeue: " + elements);
        System.out.println("Removing element pop(): " + elements.pop());
        System.out.println("Removing element poll(): " + elements.poll());
        System.out.println("Removing element pollFirst(): " + elements.pollFirst());
        System.out.println("Removing element pollLast(): " + elements.pollLast());
        
        System.out.println("");

        System.out.println("------ Iterating element ------");
        elements.add("Earth");
        elements.add("Air");
        elements.add("Water");
        elements.add("Mountains");
        System.out.println("Again Added elements: " + elements);
        System.out.println("'Type-safe forward iteration'");
        for (Iterator<String> dequeueEle = elements.iterator();
            dequeueEle.hasNext();){
                System.out.println(dequeueEle.next() + " ");
        }
        System.out.println();

        System.out.println("'Type-safe reversed iteration'");
        for (Iterator<String> dequeueEle = elements.descendingIterator();
            dequeueEle.hasNext();){
                System.out.println(dequeueEle.next() + " ");
        }
    }
}
