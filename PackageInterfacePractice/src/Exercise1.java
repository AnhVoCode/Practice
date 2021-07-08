import java.lang.Math;

public class Exercise1 {
    double circleArea(double radius){
        return Math.pow(radius,2) * Math.PI;
    }

    double circlePerimeter(double radius){
        return 2 * radius * Math.PI;
    }

    public static void main(String[] args) {
        Exercise1 c1 = new Exercise1();
        System.out.println(c1.circleArea(3));
        System.out.println( c1.circlePerimeter(3));
    }
}
