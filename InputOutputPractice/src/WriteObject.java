import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee[] employees = new Employee[]{ new Employee("232443","Nhi",18,30232.2f),
                new Employee("789234", "han", 18, 3423.5f ),
                new Employee("434589", "po", 19, 2323.4f)};

        FileOutputStream fos = new FileOutputStream("fileObject.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(int i=0; i<employees.length; i++){
            oos.writeObject(employees[i].toString());
        }
        oos.close();
    }

}
