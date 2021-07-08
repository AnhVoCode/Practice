import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i=0; i<5; i++){
            int num = in.nextInt();
            arr[i] = num;
        }

        try {
            arr[6] = 4;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index Out Of Bound");
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
