package Java.Collections.Interfaces.Practice;
import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        System.out.println("Map Operations");

        System.out.println("------- Adding Elements -------");
        Map<String, String> names = new HashMap<>();
        names.put("n1","John");
        names.put("n2","Don");
        names.put("n3","Bob");
        names.put("n4","Sam");
        System.out.println("Names: " + names);
        System.out.println("");

        System.out.println("-------  Changing Element -------");
        System.out.println("Initial Names: " + names);
        names.put("n4", "Ash");
        System.out.println("Updated Names: " + names);
        System.out.println("");

        System.out.println("------- Removing Elements -------");
        System.out.println("Remove Person: " + names.remove("n4"));
        System.out.println("Updated Names: " + names);
        System.out.println("");

        System.out.println("------- Iterating through the Map -------");
        for (Map.Entry<String, String> elements : names.entrySet()){
            String key = elements.getKey();
            String value = elements.getValue();
            System.out.println(key + " :" + value);
        }
        System.out.println("");
    }
}
