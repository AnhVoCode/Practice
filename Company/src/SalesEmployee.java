import java.util.ArrayList;
import java.util.Scanner;

public class SalesEmployee extends Employee{
    double sales;
    double commission;

    SalesEmployee(String name,String id, double salary, double sales, double commission){
        super(name, id, salary);
        this.sales = sales;
        this.commission = commission;
    }

    @Override
    double getIncome() {
        return this.salary + this.sales*this.commission;
    }

    @Override
    void updateEmployee(ArrayList<Employee> employees, String id) {
        int i = 0;
        boolean found = false;
        while(i < employees.size()-1 || found ){
            if(employees.get(i).id.equals(id)) {
                Scanner in = new Scanner(System.in);
                this.name = in.nextLine();
                in.nextLine();
                this.id = in.nextLine();
                in.nextLine();
                this.salary = in.nextDouble();
                in.nextLine();
                this.sales = in.nextDouble();
                in.nextLine();
                this.commission = in.nextDouble();
                found = true;
            }
            i++;
        }
        if(found){
            System.out.println("No employees with this ID");
        }

    }
}
