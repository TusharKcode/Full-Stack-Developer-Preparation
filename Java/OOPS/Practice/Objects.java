package Java.OOPS.Practice;

public class Objects {
    String name;
    String breed;
    int age;
    String color;

    public Objects (String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "Name is: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nColor: " + color;
    }

    public static void main(String[] args) {
        Objects bob = new Objects("Bob", "Papillon", 5, "Brown");
        System.out.println(bob);
    }
}
