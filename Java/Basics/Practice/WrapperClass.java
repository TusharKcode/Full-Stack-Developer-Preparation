package Practice;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("Autoboxing");
        // char ch = 'a';

        // // Autoboxing: char -> Character
        // Character c = ch;
        // ArrayList<Integer> list = new ArrayList<>();
        // // Autoboxing: int -> Integer
        // list.add(25);
        // System.out.println(list.get(0));
        // System.out.println(c);

        System.out.println("");

        System.out.println("Unboxing");
        Character ch = 'a';
        char c = ch;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        int num = list.get(0);
        System.out.println(num);
        System.out.println(c);

    }    
}
