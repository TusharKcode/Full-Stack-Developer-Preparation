package Java.Generics;

import java.util.*;

public class WildCardTypes {
    public static double sum(List<? extends Number> list){
        double sum  = 0.0;
        for(Number i : list){
            sum += i.doubleValue();            
        }
            return sum;
    }

    public static void printOnlyIntegerClassOrSuperClass(List<? super Integer> list){
        System.out.println(list);
    }

    public static void printList(List<?> list){
        System.out.println(list);
    }
    public static void main(String[] args) {

        System.out.println("----- Upper Bounded Wildcards -----");
        List<Integer> list1 = Arrays.asList(2, 4, 5, 3);
        System.out.println("Total sum of List 1: " + sum(list1));

        List<Double> list2 = Arrays.asList(2.9, 4.7, 5.5, 3.0);
        System.out.println("Total sum of List 2: " + sum(list2));

        System.out.println("----- Lower Bounded Wildcards -----");
        List<Integer> newL1 = Arrays.asList(2, 4, 5, 3);
        printOnlyIntegerClassOrSuperClass(newL1);

        List<Number> newL2 = Arrays.asList(2, 4, 5, 3);
        printOnlyIntegerClassOrSuperClass(newL2);

        System.out.println("----- UnBounded Wildcards -----");
        List<Integer> newList1 = Arrays.asList(2, 4, 5, 3);
        List<Double> newList2 = Arrays.asList(2.9, 4.7, 5.5, 3.0);

        System.out.println(newList1);
        System.out.println(newList2);
    }
}
