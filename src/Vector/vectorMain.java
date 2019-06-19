package Vector;

import java.util.Locale;
import java.util.Scanner;

public class vectorMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int vecSize = sc.nextInt();
        double[] vec= new double[vecSize];
        double sum = 0;
        for(int i = 0;i<vecSize;i++){
            vec[i]= sc.nextDouble();
            sum += vec[i];
        }
        System.out.printf("AVERAGE HEIGHT: %2f%n",sum/vec.length);;
    }
}
