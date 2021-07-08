import java.util.Scanner;

public class Student extends Person{
    //Fields
    private int mark;
    private String grade;

    //Constructor
    Student(String id, String name, int age, int mark){
        super(id, name, age);
        this.mark = mark;
    }

    //Getters
    public int getMark(){
        return this.mark;
    }

    public String getGrade(){
        return this.grade;
    }

    //Method
    public void calGrade(){
        if(this.mark >= 8){
            this.grade = "distinction";
        }
        else if(this.mark >=7){
            this.grade = "credit";
        }
        else if(this.mark >= 5){
            this.grade = "pass";
        }
        else{
            this.grade = "fail";
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner in = new Scanner(System.in);
        this.mark = in.nextInt();
        in.nextLine();
    }

    @Override
    public void display() {
        super.display();
        this.calGrade();
        System.out.println("Mark: " + this.mark);
        System.out.println("Grade: " + this.grade);
    }
}
