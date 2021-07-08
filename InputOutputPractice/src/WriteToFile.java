import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{ new Employee("232443","Nhi",18,30232.2f),
                new Employee("789234", "han", 18, 3423.5f ),
                new Employee("434589", "po", 19, 2323.4f)};
        try {
            //Write to file
            File file = new File("employee.txt");
            FileWriter fw = new FileWriter(file);
            for(int i=0; i<employees.length;i++){
                fw.write(employees[i].toString());
                fw.write("\n");
            }
            fw.close();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
