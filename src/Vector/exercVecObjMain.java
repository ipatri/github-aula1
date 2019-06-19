package Vector;

import Entities.vecProduct;

import java.util.Locale;
import java.util.Scanner;

public class exercVecObjMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int vecSize = sc.nextInt();
        vecProduct[] vec = new vecProduct[vecSize];
        for(int i =0;i<vecSize;i++){
            sc.nextLine();
           String name = sc.nextLine();
           double price = sc.nextDouble();
           vec[i] = new vecProduct(name,price);
        }
        double sum = 0.0;
        for(int i =0;i<vecSize;i++){
            sum += vec[i].getPrice();
        }
        double avg = sum/vecSize;
        System.out.printf("AVG: = %.2f",avg);

        sc.close();
    }
}
