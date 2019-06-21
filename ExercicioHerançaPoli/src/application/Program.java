package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of emplyoees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data:%n",i+1);
            System.out.print("Outsourced (y/n)? ");
            char out = sc.next().charAt(0);
            if(out=='y'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharges = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharges));
            }
            else{
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                employees.add(new Employee(name,hours,valuePerHour));
            }
        }
        System.out.println("");
        System.out.println("PAYMENTS:");
        for (Employee e : employees) {
            System.out.println(e.getName()+" - $ "+e.payment());
        }
        sc.close();
    }
}
