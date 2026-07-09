package Java.Collections.Utility;

import java.util.*;

// Define the Student class
class Student{
    
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}

// Comparator for multiple fields
class StudentComparator implements Comparator<Student>{
    
    public int compare(Student s1, Student s2) {
        //String comparison using compareTo() is case-sensitive. 
        int nameCompare = s1.getName().compareTo(s2.getName());
        int ageCompare = s1.getAge().compareTo(s2.getAge());
        return (nameCompare == 0) ? ageCompare : nameCompare;
    }
}

public class ComparatorOperation {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("David", 27));
        students.add(new Student("Sam", 23));
        students.add(new Student("John", 37));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name, then by age
        Collections.sort(students, new StudentComparator());

        System.out.println("\nAfter Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
