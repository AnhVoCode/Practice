import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Employee{
    double duty;

    Manager(String name, String id, double salary, double duty){
        super(name, id, salary);
        this.duty = duty;
    }

    @Override
    double getIncome() {
        return super.salary + this.duty;
    }

    @Override
    void updateEmployee(ArrayList<Employee> employees, String id) {
        int i = 0;
        boolean found = false;
        while(i < employees.size() || found ){
            if(employees.get(i).id.equals(id)) {
                Scanner in = new Scanner(System.in);
                this.name = in.nextLine();
                in.nextLine();
                this.id = in.nextLine();
                in.nextLine();
                this.salary = in.nextDouble();
                in.nextLine();
                this.duty = in.nextDouble();
                found = true;
            }
            i++;
        }
        if(found){
            System.out.println("No employees with this ID");
        }

    }
}
