public abstract class PolyStudents {
    //fields
    String name;
    String major;

    PolyStudents(String name, String major){
        this.name = name;
        this.major = major;
    }

    public abstract double getGrade();
    public String getType(){
        double grade = getGrade();
        String type = "";
        if(grade < 5){
            type = "weak";
        }
        else if(grade >= 5 && grade < 6.5){
            type = "average";
        }
        else if(grade >=6.5 && grade < 7.5){
            type = "fair";
        }
        else if(grade >= 7.5 && grade < 9){
            type = "good";
        }
        else{
            type = "excellent";
        }
        return type;
    }

    void output(){
        System.out.println("Name: " + this.name);
        System.out.println("Major: " + this.major);
        System.out.println("Grade: " + getGrade());
        System.out.println("Type: " + getType());
    }
}
