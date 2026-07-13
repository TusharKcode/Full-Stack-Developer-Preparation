package Java.MultiThreading.Synchronization.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunication {
    private static final Queue<Integer> queue = new LinkedList<>(); // Shared queue used by both producer and consumer
    
    private static final int CAPACITY = 10;         // Maximum capacity of the queue

    private static final Runnable producer = new Runnable() {       // Producer task
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == CAPACITY) {          // Wait if the queue is full
                        try {
                            System.out.println("Queue is at max capacity");
                            queue.wait();                       // Release the lock and wait
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    queue.add(10);                  // Add item to the queue
                    System.out.println("Added 10 to the queue");
                    queue.notifyAll();                  // Notify all waiting consumers
                    try {
                        Thread.sleep(2000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    private static final Runnable consumer = new Runnable() {       // Consumer task
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {       // Wait if the queue is empty
                        try {
                            System.out.println("Queue is empty, waiting");
                            queue.wait();               // Release the lock and wait
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Removed " + queue.remove() + " from the queue");    // Remove item from the queue
                    queue.notifyAll();              // Notify all waiting producers
                    try {
                        Thread.sleep(2000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        System.out.println("Main thread started");
        
        Thread producerThread = new Thread(producer, "Producer");   // Create and start the producer thread
        Thread consumerThread = new Thread(consumer, "Consumer");   // Create and start the consumer thread
        producerThread.start();
        consumerThread.start();
        System.out.println("Main thread exiting");
    }
}
