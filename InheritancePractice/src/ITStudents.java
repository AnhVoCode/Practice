public class ITStudents extends PolyStudents{
    double javaGrade;
    double cssGrade;
    double htmlGrade;

    ITStudents(String name, double javaGrade, double cssGrade, double htmlGrade){
        super(name,"IT");
        this.javaGrade =javaGrade;
        this.cssGrade = cssGrade;
        this.htmlGrade = htmlGrade;
    }

    @Override
    public double getGrade() {
        return (2 * this.javaGrade + this.htmlGrade + this.cssGrade)/4;
    }
}
