package Java.Basics.Practice;

public class Literal {
    public static void main(String[] args) {

        System.out.println("------- Integral Literals -------");
        int a = 101;    // decimal-form literal
        int b = 0100;   // octal-form literal
        int c = 0xFace; // Hexadecimal form literal
        int d = 0b1111; // Binary literal

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("------- Floating Point Literals -------");
        float da = 101.230f;    // decimal-form literal (float type suffix 'f' or 'F' is required)
        float db = 0123.222f;   // a decimal literal despite the leading zero
                                // Hexadecimal floating-point literals ARE supported in Java (since Java 5).
                                // They use 'p' or 'P' to specify the binary exponent.
        double dc = 0x1.8p3;   // 1.8 (hex) × 2^3 = 12.0
        System.out.println(da);
        System.out.println(db);
        System.out.println(dc);
        
        System.out.println("------- Char Literals -------");
        char ch = 'a';  // single character literal within single quotes

        // invalid octal literal (causes compilation error) char b = 0789; 
        // commented out due to error System.out.println(b); 
        
        char c1 = '\u0061';     // Unicode representation
        System.out.println(ch);
        System.out.println(c1);

        System.out.println("\"  is a symbol");  // Escape character literal

        System.out.println("------- String Literals -------");
        String s = "Hello";
        System.out.println(s);
        // Without double quotes, it is treated as a variable and causes a compiler error
        // String s1 = Hello; 
        // commented out due to error System.out.println(s1);

        System.out.println("------- Boolean Literals -------");
        boolean bool = true;
        boolean bool1 = false;
        System.out.println(bool);
        System.out.println(bool1);
    }
}
