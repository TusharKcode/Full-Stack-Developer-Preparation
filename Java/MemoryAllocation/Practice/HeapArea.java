package Java.MemoryAllocation.Practice;

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class HeapArea {
    //Here the student object will be stored in the heap memory and the references will be stored in
    // the stack memory
    public static void main(String[] args){
        Student s1 = new Student("John", 22);
        System.out.println(s1);
    }

    // Student object is allocated in the heap memory.
    // reference s which points to the object is stored in the stack memory
}
