package Java.Collections.List.Practice;

import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        System.out.println("Linked List");

        System.out.println("-------- Adding Elements --------");
        LinkedList<String> list = new LinkedList<>();
        list.add("Earth");
        list.add("Mars");
        list.add("Jupiter");
        list.add("Moon");
        list.add(0,"Sun");
        System.out.println("Linked List elements: " + list);

        System.out.println("");

        System.out.println("-------- Update Elements --------");
        list.set(1, "Earth");
        System.out.println("Linked list after updating: " + list);

        System.out.println("");
        System.out.println("-------- Removing Elements --------");
        list.remove(3);
        System.out.println("Linked list after removing 3 index value: " + list);
        System.out.println("");

        System.out.println("-------- Iterating a LinkedList --------");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println("");
    }
}
