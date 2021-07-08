package java_test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int mark;
    private String grade;
    private static final int MARK = 0;
    private static final String GRADE = "NO_GRADE";
    private static final int ID = 0;
    private static final String NAME = "NO_NAME";

    public Student(int id, String name, int mark, String grade){
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.grade = grade;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setGrade(){
        if(mark >= 8){
            grade = "Distinction";
        }
        else if(mark >= 7){
            grade = "Great";
        }
        else if(mark >= 5){
            grade = "Pass";
        }
        else{
            grade = "Fail";
        }
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + mark + "\t" + grade + "\n";
    }

    public void input(){
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Input id: ");
            id = in.nextInt();
            try {
                System.out.println("Input name: ");
                name = in.next();
                if(name.matches(".*\\d.*")){
                    throw new Exception("Please input name without digits");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            System.out.println("Input mark: ");
            mark = in.nextInt();
            this.setMark(mark);
        }catch (InputMismatchException e){
            System.out.println("Must input integer type");
        }

    }


    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Student: " + s);
        s.input();
        s.setGrade();
        System.out.println("Output: ");
        System.out.println(s);
    }

}
