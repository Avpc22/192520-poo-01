package utils;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;   
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    void Student( String name, int age , String id) {
         this.name = name;
         this.age = age;
         this.id = id;
        System.out.println("Student created: " + name + ", Age: " + age + ", ID: " + id);
    }
    void study() {
        System.out.println(name + " is studying.");
    }
}
