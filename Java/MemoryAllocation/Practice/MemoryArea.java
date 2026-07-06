package Java.MemoryAllocation.Practice;

class Geeks {

    static int v = 100; // static variables are stored in the Method Area

    int i = 10;         // instance variables are stored in the Heap

    public void Display()
    {
        int s = 20;     // local variables are stored in the Stack

        System.out.println(v);
        System.out.println(s);
    }
}

public class MemoryArea {
    public static void main(String[] args) {
        Geeks g = new Geeks();
        g.Display();    // Calling the Display method
    }
}
