import java.util.Scanner;

class FactorialCalc{
    int result = 1;

    int calcFac(int n){
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial: ");
        Scanner scnFac = new Scanner(System.in);

        if(scnFac.hasNext()){
            int num = scnFac.nextInt();
            FactorialCalc factorialCalc = new FactorialCalc();
            System.out.println(factorialCalc.calcFac(num));
        } else{
            System.out.println(".X....X....X.");
        }

        scnFac.close();
    }
}
