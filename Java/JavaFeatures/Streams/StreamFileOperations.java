package Java.JavaFeatures.Streams;

import java.util.stream.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class StreamFileOperations {
    private static List<String> filterAndConvertToUppercase(Stream<String> stream, int length){
        return stream.filter(s -> s.length() == length)
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        String fileName = "C:/Full-Stack-Development/Java/JavaFeatures/Streams/file.txt";

        // Step 1: Create a Stream of lines from the file
        try (Stream<String> lines = Files.lines(Paths.get(fileName))){
            List<String> filteredStrings = filterAndConvertToUppercase(lines, 5);
            System.out.println("Filtered strings with length 5 (converted to uppercase): " + filteredStrings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] words = {"Hell0", "Earth", "Developers", "Plane"};

        // Step 1: Create a PrintWriter to write to the file
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {
            
            Stream.of(words).forEach(pw::println);   // Step 2: Use Stream to write each word to the file

            // Step 3: Print success message to the console
            System.out.println("Words written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
