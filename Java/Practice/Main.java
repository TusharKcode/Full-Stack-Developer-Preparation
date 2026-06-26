class WholeSq{
    int num1;
    int num2;

    WholeSq(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }

    int calculateWholeSq(){
        return (num1 * num1) + (num2 * num2) + (2 * num1 * num2);
    }
}

public class Main {
    public static void main(String[] args) {
        WholeSq sum = new WholeSq(2, 5);
        System.out.println("Result of whole sq: ");
        System.out.println(sum.calculateWholeSq());
    }
}