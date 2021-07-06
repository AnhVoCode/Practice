public class EconStudent extends PolyStudents {
    double marketingGrade;
    double salesGrade;

    EconStudent(String name, double marketingGrade, double salesGrade){
        super(name, "economic");
        this.marketingGrade = marketingGrade;
        this.salesGrade = salesGrade;
    }

    public double getGrade(){
        return (2 * marketingGrade + salesGrade)/3;
    }
}
