package Java.Strings.Practice;

public class StringBufferMethod {
    public static void main(String[] args) {
        System.out.println("------ append() Method ------");
        StringBuffer appendSb = new StringBuffer("Hello");
        appendSb.append(" Java");
        System.out.println(appendSb);         // Hello Java
        System.out.println("");         

        System.out.println("------ insert() Method ------");
        StringBuffer insertSb = new StringBuffer("Hello");
        insertSb.insert(1, " Java");
        System.out.println(insertSb);         // HJavaello
        System.out.println("");

        System.out.println("------ replace() Method ------");
        StringBuffer replaceSb = new StringBuffer("Hello");
        replaceSb.replace(1, 3, "Java");
        System.out.println(replaceSb);        // HJavalo
        System.out.println("");

        System.out.println("------ delete() Method ------");
        StringBuffer deleteSb = new StringBuffer("Hello");
        deleteSb.delete(1, 3);
        System.out.println(deleteSb);           // Hlo
        System.out.println("");

        System.out.println("------ reverse() Method ------");
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);             // olleH
        System.out.println("");

        System.out.println("------ capacity() Method ------");
        StringBuffer capacitySb = new StringBuffer();

        System.out.println(sb.capacity());      // default 16
        capacitySb.append("Hello");

        System.out.println(capacitySb.capacity()); // now 16
        capacitySb.append("java is my favourite language");
        
        System.out.println(capacitySb.capacity());   // (old_capacity*2)+2
        System.out.println("");

        System.out.println("------ length() ------");
        StringBuffer lengthSb = new StringBuffer("Geeks_for_Geeks");
        int p = lengthSb.length();      // Getting the length of the string        
        System.out.println("Length of string Geeks_for_Geeks= " + p);    // Getting the capacity of the string
        System.out.println("");
    }
}