class Student {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

public class prac3{
    public static void main(String[] args) {

        Student s1 = new Student(1, "John");

        System.out.println(s1); // prints object reference instead of values

    }
}

