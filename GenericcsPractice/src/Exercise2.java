import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            arr.add(i);
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}
