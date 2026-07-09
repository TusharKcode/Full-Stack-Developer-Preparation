package Java.Generics;

public class GenericClass<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void getArea(){}
    public static void main(String[] args) {
        GenericClass<Integer> rectangle = new GenericClass<>(); // Object of generic class with parameter Type as Integer
        GenericClass<Double> circle = new GenericClass<>();     // Object of generic class with parameter Type as Double
        rectangle.add(10);
        circle.add(2.5);
        rectangle.get();
    }
}
