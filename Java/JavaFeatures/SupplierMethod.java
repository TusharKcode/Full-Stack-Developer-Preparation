package Java.JavaFeatures;

import java.util.function.Supplier;

public class SupplierMethod {
    public static void main(String[] args) {
        System.out.println("====== Get() Method ======");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Supplier<StringBuilder> supplier = () -> new StringBuilder("Java");
        System.out.println(supplier.get());
    }
}
