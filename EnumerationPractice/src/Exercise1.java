import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        System.out.println("Square root of two input integer: ");
        System.out.println(Math.sqrt(a));
        System.out.println(Math.sqrt(b));

        System.out.println("a to the power of b: ");
        double power = Math.pow (a,b);
        System.out.println(power);

        System.out.println("Maximum: ");
        System.out.println(Math.max(a,b));

        System.out.println("Minimum: ");
        System.out.println(Math.min(a,b));

    }
}
