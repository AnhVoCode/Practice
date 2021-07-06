import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee manager1 = new Manager("nhi", "200342", 3, 6);
        Employee manager2 = new Manager("han", "123233", 10, 6);
        Employee sales1 = new SalesEmployee("anh", "232456", 2,4,0.1);
        Employee sales2 = new SalesEmployee("vi", "834303", 4, 5, 0.1);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(manager1);
        employees.add(manager2);
        employees.add(sales1);
        employees.add(sales2);

        for(Employee e : employees){
            e.output();
        }

        manager1.findEmployee(employees, "232456");
        manager1.removeEmployee(employees, "232456");
        for(Employee e : employees){
            e.output();
        }

        manager1.findEmployee(employees, 4);
        manager1.sortByName(employees);
        System.out.println("Sort by name: ");
        for(Employee e : employees){
            e.output();
        }
        manager1.sortByIncome(employees);
        System.out.println("Sort by Income: ");
        for(Employee e : employees){
            e.output();
        }

        System.out.println("5 highest income: ");
        manager1.fiveHighestIncome(employees);
    }
}
