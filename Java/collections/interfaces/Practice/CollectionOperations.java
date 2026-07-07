package Java.Collections.Interfaces.Practice;

import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {
        System.out.println("------------- Adding Elements -------------");
        Collection<Integer> numbers = new ArrayList<>(); // Creating a collection using ArrayList implementation
        numbers.add(10);     // Adding individual elements
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        Collection<Integer> moreNum = new ArrayList<>();    // Adding another collection
        moreNum.add(50);
        moreNum.add(60);
        moreNum.add(70);

        numbers.addAll(moreNum);
        System.out.println("After Adding elements: "  + numbers);

        System.out.println("");
        
        System.out.println("------------- Removing Elements -------------");
        Collection<Integer> toRemove = new ArrayList<>();
        toRemove.add(80);
        toRemove.add(90);
        toRemove.add(100);
        System.out.println("Before removing elements: " + toRemove);

        toRemove.remove(90);            // Remove a specific element
        System.out.println("After removing Single element: " + toRemove);

        toRemove.removeAll(toRemove);     // Remove all elements present 
        System.out.println("After Removing all: " + toRemove);

        System.out.println("");
        
        System.out.println("------------- Accessing Elements -------------");
        List<String> toAccess = new ArrayList<>();
        toAccess.add("Apple");
        toAccess.add("Banana");
        toAccess.add("Mango");
        System.out.println("Before Accessing elements: " + toAccess);
        System.out.println("Element at 0 Index: " + toAccess.get(0));
        System.out.println("");

        System.out.println("------------- Iterating over a Collection -------------");
        Collection<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Mango", "Banana"));
        Iterator<String> it = fruits.iterator();

        while(it.hasNext()){
            String fruit = it.next();
            if(fruit.equals("Banana")){
                it.remove();                    // safely removes "Banana" from collection
            }
        }
        System.out.println(fruits);
        System.out.println("");

        System.out.println("------------- List Iterating over a Collection -------------");
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green"));
        ListIterator<String> itColor = colors.listIterator();

        System.out.println("Forward: ");         // Forward traversal
        while (itColor.hasNext()) {
            System.out.println(itColor.next() + " ");
        }
        System.out.println("\nBackward: ");
        while(itColor.hasPrevious()){
            System.out.println(itColor.previous() + " ");
        }
    }
}
