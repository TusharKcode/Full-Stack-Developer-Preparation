package Java.Strings.Practice;

public class StrMethods {
    public static void main(String[] args) {
        System.out.println("------ int length() Method ------");
        String s = "Hello, World!";
        System.out.println(s.length());             // 13
        System.out.println("");

        System.out.println("------ charAt(int i) Method ------");
        String str = "Hello, World!";
        System.out.println(str.charAt(7));   // W
        System.out.println("");

        System.out.println("------ String substring(int i) Method ------");
        String subStr = "Hello, World!";
        System.out.println(subStr.substring(7));    // World!
        System.out.println("");

        System.out.println("------ String substring(int i, int j) Method ------");
        String subStr2 = "Hello, World!";
        System.out.println(subStr2.substring(7, 12));   // World
        System.out.println("");

        System.out.println("------ String concat( String str) Method ------");
        String concatStr = "Hello, World!";
        System.out.println(concatStr.concat("!!!"));    // Hello, World!!!!
        System.out.println("");

        System.out.println("------ int indexOf(String s) Method ------");
        String strIndex = "Hello, World!";
        System.out.println(strIndex.indexOf("World"));  // 7
        System.out.println("");

        System.out.println("------ int indexOf(String s, int i) Method ------");
        String strIndex2 = "Hello, World!";
        System.out.println(strIndex2.indexOf("l", 4));  // 10
        System.out.println("");

        System.out.println("------ int lastIndexOf(String s) Method ------");
        String strIndex3 = "Hello, World!";
        System.out.println(strIndex3.lastIndexOf("l")); // 10
        System.out.println("");

        System.out.println("------ boolean equals(Object otherObj) Method ------");
        String boolStr = "Hello, World!";
        System.out.println(boolStr.equals("Hello, World!"));    // true
        System.out.println(boolStr.equals("Hello,"));           // false
        System.out.println("");

        System.out.println("------ boolean equalsIgnoreCase(String anotherString) Method ------");
        String boolStr2 = "Hello, World!";
        System.out.println(boolStr2.equalsIgnoreCase("hello, world!")); // true
        System.out.println("");

        System.out.println("------ int compareTo(String anotherString) Method ------");
        String compareStr = "Hello, World!";
        System.out.println(compareStr.compareTo("Hello, Java!"));   // 13
        System.out.println(compareStr.compareTo("Java, Hello!"));   // -2
        System.out.println(compareStr.compareTo("Hello, World!"));   // 0
        System.out.println("");

        System.out.println("------ int compareToIgnoreCase(String anotherString) Method ------");
        String compareStr2 = "Hello, World!";
        System.out.println(compareStr2.compareToIgnoreCase("hello, java!"));
        System.out.println("");

        System.out.println("------ String toLowerCase() Method ------");
        String lowerStr = "Hello, World!";
        System.out.println(lowerStr.toLowerCase());
        System.out.println("");

        System.out.println("------ String toUpperCase() Method ------");
        String upperStr = "Hello, World!";
        System.out.println(upperStr.toUpperCase());
        System.out.println("");

        System.out.println("------ String trim() Method ------");
        String trimStr = "   Hello, Trim!   ";
        System.out.println("'" + trimStr.trim() + "'");
        System.out.println("");

        System.out.println("------ String replace(char oldChar, char newChar) Method ------");
        String replaceStr = "Hello, World!";
        System.out.println(replaceStr.replace('l', 'x'));
        System.out.println("");

        System.out.println("------ boolean contains(CharSequence sequence) Method ------");
        String booleanStr = "Hello, World!";
        System.out.println(booleanStr.contains("World"));
        System.out.println("");

        System.out.println("------ char[] toCharArray() Method ------");
        String charArrayStr = "Hello";
        char[] chars = charArrayStr.toCharArray();
        for(char c : chars) {
            System.out.print(c + " ");      // H e l l o 
        }
        System.out.println("");

        System.out.println("------ boolean startsWith(String prefix) Method ------");
        String prefixStr = "Hello, World!";
        System.out.println(prefixStr.startsWith("Hello"));
        System.out.println("");
    }
}
