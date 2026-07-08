package Java.Collections.List.Practice;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {

        Stack stack1 = new Stack();                     // Default initialization of Stack
        Stack<String> stack2 = new Stack<String>();     // Initialization of Stack using Generics

        stack1.push("Apple");       // pushing the elements
        stack1.push("All");
        stack1.push("Air");

        stack2.push("Apple");
        stack2.push("All");
        stack2.push("Air");

        System.out.println(stack1);        // Printing the Stack Elements
        System.out.println(stack2);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the" + " stack is: " + stack2.peek());

        // Removing elements using pop() method
        System.out.println("Popped element: " + stack2.pop());
        System.out.println("Is stack empty? " + stack2.isEmpty());
    }
}
