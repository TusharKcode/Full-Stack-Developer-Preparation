package Java.JavaFeatures.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        System.out.println("======== Stream Creation ========");

        List<String> list = Arrays.asList("Java", "Python", "JavaScript");  // 1. From a Collection
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        String[] arr = {"A", "B", "C"};                                 // 2. From an Array
        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);

        Stream<Integer> stream3 = Stream.of(1,2,3,4,5);     // 3. Using Stream.of() 
        stream3.forEach(System.out::println);

                                                    // 4. Infinite Stream (limit to avoid infinite loop)
        Stream<Integer> stream4 = Stream.iterate(1, n -> n + 1).limit(5);
        stream4.forEach(System.out::println);

        System.out.println();

        System.out.println("======== Intermediate Operations in Stream ========");
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        number.stream()
            .filter(n -> n > 3)     // greater than 3
            .map(n -> n * 2)        // double them
            .distinct()             // removes duplicates
            .sorted()               // sort in ascending order
            .skip(1)             // skip 1st element
            .forEach(System.out::println);

        System.out.println();

        System.out.println("======== Terminal Operations in Stream ========");
        List<String> names = Arrays.asList("John", "Sam", "Kevin", "John");

        // Collect into Set (removes duplicates)
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
        System.out.println(uniqueNames);

        // Count names starting with 'S'
        long count = names.stream().filter(n -> n.startsWith("S")).count();
        System.out.println("Names starting with R: " + count);

        // Reduce (concatenate names)
        String result = names.stream().reduce("", (a, b) -> a + b + " ");
        System.out.println(result);

        System.out.println();
        System.out.println("======== Types of Streams ========");
        System.out.println("------- Sequential Stream -------");
        List<String> alphabets = Arrays.asList("A", "B", "C", "D", "E"); 
        alphabets.stream().forEach(System.out::println);        // Executes sequentially

        System.out.println();
        System.out.println("------- Parallel Stream -------");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.parallelStream()
            .forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));

        System.out.println();
        System.out.println("------- Infinite Stream -------");
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("------- Primitive Stream -------");
        IntStream.range(1, 5).forEach(System.out::println);
        DoubleStream.iterate(1.0, n -> n + 0.1).limit(4).forEach(System.out::println);
        LongStream.range(1, 5).forEach(System.out::println);
    }
}
