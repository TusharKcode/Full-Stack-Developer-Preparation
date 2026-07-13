package Java.MultiThreading.Synchronization.Practice;

class Bank{     
    private int balance = 1000;         // Shared resource (bank balance)

    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount + ", Balance: " + balance);            
        } else{
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }

    public int getBalance(){
        return balance;
    }
}

public class ProcessSynchronization {
    public static void main(String[] args) {
        
        Bank accBank = new Bank();
    
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                accBank.deposit(200);
                try {
                    Thread.sleep(50);       // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                accBank.withdraw(100);
                try {
                    Thread.sleep(100);      // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();     // Start both threads
        t2.start();

        try {           // Wait for threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + accBank.getBalance());
    }
}
