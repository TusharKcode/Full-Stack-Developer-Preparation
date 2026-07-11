package Java.JavaFeatures;

import java.util.*;
import java.util.stream.Collectors;

public class City {
    private String name;
    private double temperature;

    public City(String name, double temperature){
        this.name = name;
        this.temperature = temperature;
    }

    public String getName(){
        return name;
    }

    public Double getTemp(){
        return temperature;
    }

    @Override
    public String toString(){
        return name  + " -> " + temperature;
    }

    private static List<City> prepareTempCities(){
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));  // duplicate
        cities.add(new City("Dubai", 43));   // duplicate
        return cities;
    }

    public static void main(String[] args) {
        System.out.println("======== Collector Methods ========");
        // System.out.println("------- toCollection(Supplier<C> collectionFactory) -------");
        // System.out.println(prepareTempCities().stream()
        //     .map(f -> f.getName())
        //     .collect(Collectors.toCollection(ArrayList::new)));
        // System.out.println();
        
        System.out.println("------- toList() -------");
        System.out.println(prepareTempCities().stream()
            .filter(f -> f.temperature > 10)
            .map(f -> f.getName())
            .collect(Collectors.toList()));
        System.out.println();

        System.out.println("------- toSet() -------");
        System.out.println(prepareTempCities().stream()
            .filter(f -> f.temperature > 10)
            .map(f -> f.getName())
            .collect(Collectors.toSet()));
        System.out.println();


        System.out.println("------- toMap() -------");
        System.out.println(prepareTempCities().stream()
            .filter(city -> city.temperature > 10)
            .collect(Collectors.toMap(
                City::getName,
                City::getTemp, 
                (key, identicalKey) -> key)));
        System.out.println();

        System.out.println("------- collectingAndThen() -------");
        System.out.println(prepareTempCities().stream() // Collects the elements and counts the occurrences
            .collect(Collectors.groupingBy(
                City::getName,
                Collectors.collectingAndThen(
                    Collectors.counting(), f -> f.intValue())
            )));
        System.out.println();

        System.out.println("------- counting() -------");
        System.out.println(prepareTempCities().stream()
            .collect(Collectors.groupingBy(
                City::getName,
                Collectors.counting()
            )));
        System.out.println();

        System.out.println("------- groupingBy() -------");
        System.out.println(prepareTempCities().stream()
            .collect(Collectors.groupingBy(
                City::getName
            )));
        System.out.println();

        System.out.println("------- joining() -------");
        System.out.println("1.\n");
        System.out.println(prepareTempCities().stream()
            .filter(city -> city.temperature > 10)
            .map(f -> f.getName())
            .collect(Collectors.joining(", ")));
        System.out.println();
        System.out.println("2.\n");
        System.out.println(prepareTempCities().stream()
            .filter(city -> city.temperature > 10)
            .map(f -> f.getName())
            .collect(Collectors.joining(" ", "Prefix: ", "Suffix: ")));
        System.out.println();

        System.out.println("------- mapping() -------");
        System.out.println(prepareTempCities().stream()
            .collect(Collectors.groupingBy(
                City::getName,
                Collectors.mapping(
                    City::getTemp,
                    Collectors.toList()
                )
            )));
        System.out.println();
    }
}