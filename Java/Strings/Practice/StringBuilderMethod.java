package Java.Strings.Practice;

public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Geeks for Geeks");
        System.out.println("Initial: " + sb);

        System.out.println("");

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        System.out.println("");

        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);

        System.out.println("");

        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        System.out.println("");

        sb.delete(8, 14);
        System.out.println("After delete: " + sb);

        System.out.println("");

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("");

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        System.out.println("");

        char c = sb.charAt(5);
        System.out.println("Character at index 5: " + c);

        System.out.println("");

        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        System.out.println("");

        String sub = sb.substring(5, 10);
        System.out.println("Substring (5–10): " + sub);

        System.out.println("");

        sb.reverse(); // Revert for search
        System.out.println("Index of 'Geeks': " + sb.indexOf("Geeks"));

        System.out.println("");

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        System.out.println("");
        
        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}
