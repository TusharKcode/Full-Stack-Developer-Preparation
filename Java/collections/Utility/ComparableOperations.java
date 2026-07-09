package Java.Collections.Utility;

import java.util.*;

class CollegeStudent implements Comparable<CollegeStudent> {
    String name;
    int marks;

    CollegeStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(CollegeStudent other) {
        return Integer.compare(this.marks, other.marks);    // ascending order by marks
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparableOperations {
    public static void main(String[] args) {
        List<CollegeStudent> students = new ArrayList<>();
        students.add(new CollegeStudent("Alice", 85));
        students.add(new CollegeStudent("Bob", 92));
        students.add(new CollegeStudent("Charlie", 78));

        Collections.sort(students);

        for (CollegeStudent s : students) {
            System.out.println(s);
        }
    }
}
