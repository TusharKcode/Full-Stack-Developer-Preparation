package Java.MemoryAllocation.Practice;

public class StackMemory {

    public static int calculate(int n){     // method parameter 'n' is stored in the stack
        int ans = n * 10;                   // local variable 'ans' is stored in the stack
        return ans;
    }
    public static void main(String[] args) {
        int n = 10;                          // local variable 'n' is stored in the stack
        calculate(n);           // n is passed as an argument so its reference is stored in the stack
    }
}
