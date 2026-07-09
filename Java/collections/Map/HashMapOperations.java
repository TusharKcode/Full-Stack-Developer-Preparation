package Java.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm1 = new HashMap<>();     // No need to mention the Generic type twice

        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(); // Initialization of a HashMap using Generics

        hm1.put(1, "John");    // Add Elements using put method
        hm1.put(2, "Ash");
        hm1.put(3, "Tom");

        hm2.put(1, "Bob");
        hm2.put(2, "Nick");
        hm2.put(3, "Doom");

        System.out.println("Mappings of HashMap hm1 are : " + hm1);
        System.out.println("Mapping of HashMap hm2 are : " + hm2);

        
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("John", 25);    // Add elements to the HashMap
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);

        System.out.println("Age of John: " + hashMap.get("John"));  // Access elements using get()
        System.out.println("Age of Jane: " + hashMap.get("Jane"));

        System.out.println("\nAll entries:");   // Iterate through the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Geeks"); // Change Value using put method
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");

        System.out.println("Initial Map " + hm);
        hm.put(2, "For");
        System.out.println("Updated Map " + hm);

        hm.remove(3);   // using remove method
        System.out.println("Mappings after removal are : " + hm);   // Final HashMap

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kevin", 10);   // Add elements using put method
        map.put("Ben", 30);
        map.put("John", 20);

        
        for (Map.Entry<String, Integer> e : map.entrySet()) // Iterate the map using for-each loop
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }
}
