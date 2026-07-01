package Java.OOPS.Practice;

class Student {
            // Data member
    int id;
    String name;

                // Constructor
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class Classes {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");    // Object 's1'
        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.name);
    }
}
