import java.util.ArrayList;

public class PersonModel {
    public static class personModel<T>{
        public ArrayList<T> li = new ArrayList<>();
        public void addObject(T object){
            li.add(object);
        }
        public void display(){
            for(T e: li){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        personModel<Student> stu1 = new personModel<>();
        stu1.addObject(new Student(24214, "nhi", 19));
        stu1.addObject(new Student(43531,"han", 18));
        stu1.display();

        personModel<Employee> e1 = new personModel<>();
        e1.addObject(new Employee(43235, "bo", 20));
        e1.addObject(new Employee(24355, "cao", 17));
        e1.display();

        personModel<String> name = new personModel<>();
        name.addObject("idfa");
        name.addObject("idiot");
        name.display();

    }
}
