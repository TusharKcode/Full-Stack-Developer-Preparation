package Java.MultiThreading.Thread.Safety;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicVar {

    private static AtomicBoolean flag = new AtomicBoolean(false);
    public static void main(String[] args) {
        System.out.println("======== Types of Atomic Variables ========");
        System.out.println("--------- Atomic Integer ---------");
        AtomicInteger countInt = new AtomicInteger(5);
        countInt.incrementAndGet();
        countInt.addAndGet(6);
        System.out.println("Final value: " + countInt.get());

        System.out.println("");

        System.out.println("--------- Atomic Long ---------");
        AtomicLong countLong = new AtomicLong(100);
        countLong.getAndAdd(50);
        System.out.println("Final value: " + countLong.get());

        System.out.println("");

        System.out.println("--------- Atomic Boolean ---------");
        if(flag.compareAndSet(false, true)){
            System.out.println("Operation performed only once!");
        } else{
            System.out.println("Already performed!");
        }

        System.out.println("");

        System.out.println("--------- Atomic Reference ---------");
        AtomicReference<String> msg = new AtomicReference<>("Hello");
        msg.compareAndSet("Hello", "Hi, from AtomicReference!");
        System.out.println("Current Message: " + msg.get());

        System.out.println("");

        System.out.println("--------- Atomic Integer Array ---------");
        AtomicIntegerArray countIntArr = new AtomicIntegerArray(new int[] { 1, 2, 3 });
        countIntArr.incrementAndGet(1);
        System.out.println("Array after update: " + countIntArr);
        System.out.println("Value at index 1: " + countIntArr.get(1));

        System.out.println("");
    }
}