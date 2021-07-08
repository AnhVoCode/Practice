import java.util.ArrayList;
import java.lang.Math;

public class Exercise2 {
    ArrayList<Double> quadraticSolve(double a, double b, double c) {
        ArrayList<Double> res = new ArrayList<>();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("No solution");
        } else if (d == 0) {
            double x1, x2;
            x1 = x2 = -b / (2 * a);
            res.add(x1);
            res.add(x2);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            res.add(x1);
            res.add(x2);
        }
        return res;
    }

    public static void main(String[] args) {
        Exercise2 q1 = new Exercise2();
        ArrayList<Double> sols = q1.quadraticSolve(3,5,2);
        for(Double s: sols){
            System.out.println(s);
        }
    }
}
