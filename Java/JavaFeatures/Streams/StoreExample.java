package Java.JavaFeatures.Streams;

import java.util.*;
import java.util.stream.Collectors;

class Transaction{
    private int id;
    private int value;
    private String type;

    Transaction(int id, int value, String type){
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public int getId(){
        return id;
    }
    public int getValue(){
        return value;
    }
    public String getType(){
        return type;
    }
}

public class StoreExample {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(1, 30, "Grocery"),
            new Transaction(3, 50, "Grocery"),
            new Transaction(5, 100, "Electronics"),
            new Transaction(7, 40, "Grocery"),
            new Transaction(10, 30, "Grocery")
        );

        List<Integer> transactionIds = transactions.stream()
            .filter(t -> t.getType().equals("Grocery"))
            .sorted(Comparator.comparing(Transaction::getValue).reversed())
            .map(Transaction::getId)
            .collect(Collectors.toList());

        System.out.println(transactionIds);
    }
}
