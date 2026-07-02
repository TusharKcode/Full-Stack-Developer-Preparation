package Java.OOPS.Practice;

abstract class Shape{
                        // Abstract Methods
    String color;
    abstract double area();
    public abstract String toString();
                                        // Abstract class Constructor
    public Shape(String color){
        System.out.println("Shape Constructor Called!");
        this.color = color;
    }
                                // concrete method
    public String getColor(){
        return color;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle Constructor Called!");
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "Circle color is: " + super.getColor() + " and area is: " + area();
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("Rectangle Constructor Called!");
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }

    @Override
    public String toString(){
        return "Rectangle color is: " + super.getColor() + " and area is: " + area();
    }
}

public class AbstractClass {
    public static void main(String [] args){
        Shape s1 = new Circle("Red", 4);
        Shape s2 = new Rectangle("Blue", 10, 15);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
