package Java.MultiThreading.ConcurrencyUtilities;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++) sum += i;
            return sum;  // returns result
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Result: " + future.get()); 
        executor.shutdown();
    }
}
