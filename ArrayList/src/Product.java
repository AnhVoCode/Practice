import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Product {
    String name;
    double price;

    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input product name:");
        this.name = in.next();
        in.nextLine();
        System.out.println("Input product price:");
        this.price = in.nextDouble();
        in.nextLine();
    }


    public static void main(String[] args) {
        boolean isContinuous = true;
        ArrayList<Product> products = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        while(isContinuous){
            Product product = new Product();
            product.input();
            products.add(product);
            System.out.println("More product? Y/N ");
            if(in.nextLine().equals("N")){
                isContinuous = false;
            }
        }

        Collections.sort(products, new SortByPrice());
        for(Product p1: products){
            System.out.println(p1.name);
        }
    }
}
