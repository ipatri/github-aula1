package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<TaxPayer>list=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data:%n",i+1);
            System.out.print("Individual or company (i/c)? ");
            char typeOfTaxPayer = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(typeOfTaxPayer=='i'){
                System.out.print("Health expenditures: ");
                double healthExp = sc.nextDouble();
                list.add(new Individual(name,anualIncome,healthExp));
            }
            else{
                System.out.print("Number of employees: ");
                int empNumb = sc.nextInt();
                list.add(new Company(name,anualIncome,empNumb));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp:list) {
            System.out.println(String.format("%.2f",tp.tax()));
        }
        System.out.println();
        double sum=0.0;
        for (TaxPayer tp :list) {
            sum += tp.tax();
        }
        System.out.print("TOTAL TAXES: $ "+String.format("%.2f",sum));
        sc.close();
    }
}
