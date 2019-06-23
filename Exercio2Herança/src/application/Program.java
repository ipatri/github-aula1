package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data: %n",i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(type=='i'){
                System.out.print("Custom fee: ");
                double cf = sc.nextDouble();
                products.add(new ImportedProduct(name,price,cf));
            }
            else if(type == 'u'){
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Manufacture date ");
                Date date = sdf.parse(sc.next());
                products.add(new UsedProduct(name,price,date));
            }
            else{
                products.add(new Product(name,price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p:products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
