package application;

import model.service.PrintingService;

import java.net.Proxy;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.print("How many values?");
        PrintingService<Integer> ps = new PrintingService<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ps.addValue(sc.nextInt());
        }
        System.out.print("First: ");
        ps.first();
        System.out.println();
        ps.print();
        sc.close();
    }
}
