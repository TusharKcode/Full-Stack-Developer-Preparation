package Java.Generics;

class Bound<T extends A>{
    private T objRef;

    public Bound(T obj){
        this.objRef = obj;
    }

    public void doRunTest(){
        this.objRef.displayClass();
    }
}

class A{
    public void displayClass(){
        System.out.println("Inside super class A");
    }
}

class B extends A{
    public void displayClass(){
        System.out.println("Inside sub class B");
    }
}

class C extends A{
    public void displayClass(){
        System.out.println("Inside sub class C");
    }
}

public class BoundType {
    public static void main(String[] args) {
        Bound<C> boundC = new Bound<C>(new C());    // Creating object of sub class C and passing it to Bound as a type parameter.
        boundC.doRunTest();
        Bound<B> boundB = new Bound<B>(new B());    // Creating object of sub class B and passing it to Bound as a type parameter.
        boundB.doRunTest();
        Bound<A> boundA = new Bound<A>(new A());    // Creating object of super class A and passing it to Bound as a type parameter.
        boundA.doRunTest();
    }
}
