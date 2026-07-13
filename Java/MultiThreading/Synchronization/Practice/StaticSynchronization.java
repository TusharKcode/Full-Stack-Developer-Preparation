package Java.MultiThreading.Synchronization.Practice;

class Table{
    synchronized static void printTable(int n){
        for(int i = 1; i <= 3; i++)
            System.out.println(n * i);
    }
}

class Thread1 extends Thread{
    public void run(){
        Table.printTable(10);
    }
}

class Thread2 extends Thread{
    public void run(){
        Table.printTable(1);
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
