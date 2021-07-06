import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Employee {
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract double getIncome();

    double getIncomeTax(double salary){
        double tax;
        if(salary < 9){
            tax = 0;
        }
        else if(salary >=9 && salary <= 15){
            tax = salary*10/100;
        }
        else{
            tax = salary*12/100;
        }
        return tax;
    }

    void findEmployee(ArrayList<Employee> employees, String id){
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).id.equals(id)){
                System.out.println("Employee found: ");
                employees.get(i).output();
            }
        }
    }

    void findEmployee(ArrayList<Employee> employees, int salary){
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).salary == salary){
                System.out.println("Employee found: ");
                employees.get(i).output();
            }
        }
    }

    void removeEmployee(ArrayList<Employee> employees, String id){
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).id == id){
                employees.remove(employees.get(i));
            }
        }
    }



    void sortByName(ArrayList<Employee> employees){
        Comparator<Employee> comp = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        };
        Collections.sort(employees, comp);
    }

    void sortByIncome(ArrayList<Employee> employees){
        Comparator<Employee> comp = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return (int) (e1.getIncome() - e2.getIncome());
            }
        };
        Collections.sort(employees, comp);

    }

    void fiveHighestIncome(ArrayList<Employee> employees){
        sortByIncome(employees);
        for(int i=employees.size()-1; i>employees.size()-3;i--){
            employees.get(i).output();
        }
    }
    
    abstract void updateEmployee(ArrayList<Employee> employees, String id);

    void output(){
        System.out.println("Name: " + this.name);
        System.out.println("ID:" + this.id);
        System.out.println("Income: " + this.getIncome());
    }
}
