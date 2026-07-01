package Java.Strings.Practice;

public class StrConcatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Java Developer";
    
        // Concatenate the strings s1 and s2 using the concat() method and store the result back in s1.
        s1 = s1.concat(s2);
        System.out.println(s1);

        String s3 = s1.concat(s2);

        // Print and display temporary combined string
        System.out.println(s3);

        String s4 = "Portal";
        String s5 = s3.concat(s4);
        System.out.println(s5);
    }
}
