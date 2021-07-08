import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("hello");
        arr.add(2);
        arr.add(34.34);
        arr.add(true);
        for(Object o: arr){
            System.out.println(o);
        }

    }
}
