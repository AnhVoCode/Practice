import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two integer numbers: ");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        try {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            System.out.println("Sum: " + (num1+num2));
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
