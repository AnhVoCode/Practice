public class Square extends Rectangle{

    Square(double side){
        super(side, side);
    }

    @Override
    void output() {
        System.out.println("Side of square: " + super.width);
        System.out.println("Parameter: " + super.width * 4);
        System.out.println("Area: " + super.width * super.length);
    }
}
