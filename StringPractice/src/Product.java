import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    //Fields
    String name;
    double price;
    String  brand;

    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input product name: ");
        this.name = in.next();
        in.nextLine();
        System.out.println("Input product price: ");
        this.price = in.nextDouble();
        System.out.println("Input product brand: ");
        this.brand = in.nextLine();
        in.nextLine();
    }

    void output(){
        System.out.println("Product name: " + this.name);
        System.out.println("Product price: " + this.price);
        System.out.println("Product brand: " + this.brand);
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        for(int i=0; i<5; i++){
            Product product = new Product();
            product.input();
            products.add(product);
        }
        int i=0;
        while(i<products.size()){
            if(products.get(i).brand == "Nokia"){
                products.get(i).output();
            }
            i++;
        }
    }
}
