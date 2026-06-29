package Java.Methods.Practice;

abstract class GeeksHelp {
    abstract void check(String name); // Abstract method
}

class Test {
    static void hello() {
        System.out.println("Hello");
    }
}

public class CallStack extends GeeksHelp{
    public static void D() {
        float d = 40.5f;
        System.out.println("In Method D " + d);
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In Method C " + c);
    }

    public static void B() {
        int b = 20;
        C(); // Calling C
        System.out.println("In Method B " + b);
    }

    public static void A() {
        int a = 10;
        B(); // Calling B
        System.out.println("In Method A " + a);
    }

    void hello() {
        System.out.println("This is a user-defined method.");
    }

    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        A();
        D();

        CallStack call = new CallStack();       // Create object
        call.hello();                           // Call method
        call.check("This is Abstract Method");

        System.out.println(call.hashCode()); // Predefined method

        Test.hello();                       // Call static method directly
    }
}
