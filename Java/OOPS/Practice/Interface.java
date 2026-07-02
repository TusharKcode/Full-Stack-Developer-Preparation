package Java.OOPS.Practice;

interface Shape{
    double calculateArea();     // abstract method to calculate area
}

class Circle implements Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double calculateArea(){
        return Math.PI * r * r;
    }
}

                                            // implements interface in both classes

class Rectangle implements Shape{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }
}

public class Interface {
    public static void main(String[] args) {
                                                    // Reference type is the interface (Shape)
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(10.5, 15.5);

        // Dynamic method dispatch — decides which method to call at runtime

        System.out.println("Area of circle : " + circle.calculateArea());
        System.out.println("Area of rectangle : " + rectangle.calculateArea());
    }
}
