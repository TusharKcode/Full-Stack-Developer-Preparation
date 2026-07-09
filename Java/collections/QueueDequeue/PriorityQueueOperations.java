package Java.Collections.QueueDequeue;

import java.util.*;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(i);
            pq.add(1);
        }
        System.out.println(pq);

        PriorityQueue<String> pq1 = new PriorityQueue<>();

        pq1.add("Jon");
        pq1.add("Bob");
        pq1.add("Ken");

        System.out.println("Initial PriorityQueue " + pq1);

        pq1.remove("Geeks");    // using the method
        System.out.println("After Remove: " + pq1);
        System.out.println("Poll Method: " + pq1.poll());

        System.out.println("Final PriorityQueue: " + pq1);

        String element = pq1.peek();    // Using the peek() method
        System.out.println("Accessed Element: " + element);

        Iterator<String> iterator = pq1.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
