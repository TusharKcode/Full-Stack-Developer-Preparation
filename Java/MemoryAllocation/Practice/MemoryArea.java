package Java.MemoryAllocation.Practice;

class Geeks {

    // static variables are stored in the Method Area
    static int v = 100;

    // instance variables are stored in the Heap
    int i = 10;

    public void Display()
    {
        // local variables are stored in the Stack
        int s = 20;

        System.out.println(v);
        System.out.println(s);
    }
}

public class MemoryArea {
    public static void main(String[] args) {
        Geeks g = new Geeks();

        // Calling the Display method
        g.Display();
    }
}
