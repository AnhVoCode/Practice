
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPractice {
    ArrayList<String> name = new ArrayList<>();

    void input(){
        Scanner in = new Scanner(System.in);
        while(true){
            String n = in.next();
            in.nextLine();
            name.add(n);
            System.out.println("More input? Y/N");
            if(in.nextLine().equals("N")){
                break;
            }
        }

    }

    void output(){
        for(String n: name){
            System.out.println(n + " ");
        }
    }

    void shuffle(){
        Collections.shuffle(this.name);
    }

    void descending(){
        Collections.sort(this.name);
        Collections.reverse(this.name);
    }

    void deleteList(){
        this.name.clear();
    }

    public static void main(String[] args) {

        ArrayListPractice student = new ArrayListPractice();

        student.input();

        System.out.println("Random order: ");
        student.shuffle();
        student.output();

        System.out.println("Descending order: ");
        student.descending();
        student.output();

        student.deleteList();
        System.out.println("Empty list: ");
        student.output();
    }

}
