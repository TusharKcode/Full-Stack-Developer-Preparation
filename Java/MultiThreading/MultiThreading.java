package Java.MultiThreading;

class CookingTasks extends Thread{
    private String tasks;

    CookingTasks(String tasks){
        this.tasks = tasks;
    }

    public void run(){
        System.out.println(tasks + " is being prepared by " + Thread.currentThread().getName());
    }
}

class NewCookingTasks implements Runnable{
    private String tasks;

    NewCookingTasks(String tasks){
        this.tasks = tasks;
    }

    public void run(){
        System.out.println(tasks + " is being prepared by " + Thread.currentThread().getName());
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Thread t1 = new CookingTasks("Pasta");
        Thread t2 = new CookingTasks("Salad");
        Thread t3 = new CookingTasks("Rice");
        Thread t4 = new CookingTasks("Dessert");

        Thread task1 = new Thread(new NewCookingTasks("Soup"));
        Thread task2 = new Thread(new NewCookingTasks("Pizza"));
        Thread task3 = new Thread(new NewCookingTasks("Burger"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        task1.start();
        task2.start();
        task3.start();
    }
}