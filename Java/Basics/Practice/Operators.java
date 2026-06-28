package Practice;

public class Operators {
    public static void main(String[] args) {
        System.out.println("------- Arithmetic Operator -------");
        int a = 10, b = 3;
        int sum = a + b;    // Addition
        int diff = a - b;   // Subtraction
        int mul = a * b;    // Multiplication
        int div = a / b;    // Division
        int mod = a % b;    // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

        System.out.println("");

        System.out.println("------- Logical Operator -------");
        boolean x1 = true;
        boolean y1 = false;
        System.out.println("x && y: " + (x1 && y1));
        System.out.println("x || y: " + (x1 || y1));
        System.out.println("!x: " + (!x1));

        System.out.println("");

        System.out.println("------- Unary Operator -------");
        int x = 10;
        int y = 10;
        System.out.println("Postincrement : " + (x++));
        System.out.println("Preincrement : " + (++x));

        System.out.println("Postdecrement : " + (y--));
        System.out.println("Predecrement : " + (--y));

        System.out.println("");

        System.out.println("------- Ternary Operator -------");
        int a1 = 20, b1 = 10, c1 = 30, result;
                                                                        // result holds max of three
                                                                        // numbers
        result = ((a1 > b1) ? (a1 > c1) ? a1 : c1 : (b1 > c1) ? b1 : c1);
        System.out.println("Max of three numbers = "+ result);

        System.out.println("");

        System.out.println("------- Assignment Operator -------");
        int num = 10; 
        System.out.println("Initial: " + num);
                                                    // add 5 → num = num + 5
        num += 5;
        System.out.println("After +5: " + num);
                                                    // multiply by 2 → num = num * 2
        num *= 2;  
        System.out.println("After *2: " + num);
                                                    // subtract 5 → num = num - 5
        num -= 5;
        System.out.println("After -5: " + num);
                                                    // divide by 2 → num = num / 2
        num /= 2;
        System.out.println("After /2: " + num);
                                                    // remainder after dividing by 3 → num = num % 3
        num %= 3;
        System.out.println("After %3: " + num);

        System.out.println("");

        System.out.println("------- Bitwise & Shift Operator -------");
        int d = 0b1010;                             //  (decimal 10)
        int e1 = 0b1100;                            //  (decimal 12)
        System.out.println("d & e1 : " + (d & e1));
        System.out.println("d | e1 : " + (d | e1));
        System.out.println("d ^ e1 : " + (d ^ e1));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e1 >> 1 : " + (e1 >> 1));
        System.out.println("e1 >>> 1 : " + (e1 >>> 1));

        System.out.println("");

        System.out.println("------- Relational Operator -------");
        int e = 10;
        int f = 3;
        int g = 5;
        System.out.println("a > b: " + (e > f));
        System.out.println("a < b: " + (e < f));
        System.out.println("a >= b: " + (e >= f));
        System.out.println("a <= b: " + (e <= f));
        System.out.println("a == c: " + (e == g));
        System.out.println("a != c: " + (e != g));

        System.out.println("");

        System.out.println("------- Instance Of Operator -------");
        String str = "Hello";
        System.out.println(str instanceof String); 

        Object obj = 10; 
        System.out.println(obj instanceof Integer); 
        System.out.println(obj instanceof String); 
    }
}
