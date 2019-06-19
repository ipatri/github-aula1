package Application;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Price:");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock:");
        int quantity=sc.nextInt();
        Product product = new Product(name,price,quantity);

        System.out.println("Product data: "+product);
        System.out.print("Add: ");
        int add = sc.nextInt();
        product.AddProducts(add);
        System.out.println("Updated data: "+product);
        System.out.print("Rem:");
        int rem = sc.nextInt();
        product.RemoveProducts(rem);

        System.out.println("Updated data: "+product);
        sc.close();
    }
}