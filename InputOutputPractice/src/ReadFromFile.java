import java.io.FileReader;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("employee.txt");
            System.out.println("Read from file employee.txt");
            int ch = fr.read();
            while(ch != -1){
                System.out.print((char) ch);
                ch = fr.read();
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
