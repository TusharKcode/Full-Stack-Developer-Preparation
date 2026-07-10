package Java.JavaFeatures;

import java.util.function.Consumer;
import java.util.*;

public class ConsumerMethods {
    public static void main(String[] args) {
        System.out.println("====== Accept() Method ======");
        Consumer<Integer> display = a -> System.out.println("Displaying an Integer value: " + a); // Consumer to display a number
        display.accept(10);

        Consumer<List<Integer>> modify = list -> {  // Consumer to multiply 2 to every integer of a list
            for(int i = 0; i < list.size(); i++)
                list.set(i, 2* list.get(i));
        };
            // Consumer to display a list of numbers
        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.println("Displaying modified list: " + a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);

        modify.accept(list);
        dispList.accept(list);

        System.out.println();

        System.out.println("====== AndThen() Method ======");
        try{
            modify.andThen(dispList).accept(list);  // First Modify list and then will display it
        } catch ( Exception e){                     // with handling exception
            System.out.println("Exception " + e);
        }
    }
}
