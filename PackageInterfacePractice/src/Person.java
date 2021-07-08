import java.util.Scanner;

public class Person implements PersonExample {
    //Fields
    protected String id;
    protected String name;
    protected int age;

    //Constructor
    Person(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //methods

    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        this.id = in.nextLine();
        in.nextLine();
        this.name = in.nextLine();
        in.nextLine();
        this.age = in.nextInt();
    }

    @Override
    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
