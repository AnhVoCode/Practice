public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double parameter(){
        return (this.width+this.length) * 2;
    }

    public double area(){
        return this.width*this.length;
    }

    void output(){
        System.out.println("Width: " + this.width);
        System.out.println("Length: " + this.length);
        System.out.println("Parameter: " + this.parameter());
        System.out.println("Area: " + this.area());
    }

}
