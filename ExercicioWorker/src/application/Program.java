package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level=sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level),baseSalary, new Department(departmentName));

        System.out.print("How Many contracts? ");
        int n = sc.nextInt();


        for (int i = 0; i <n ; i++) {
            System.out.printf("Enter contract #%d data:%n",i+1);
            System.out.print("Data (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerhour = sc.nextDouble();
            System.out.print("Duration (hours):");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(date,valuePerhour,hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter the month and the year to calculate the income (MM/YYYY): ");
        String monthAndYear = sc.next();
        String[] vec = monthAndYear.split("/");
        int month = Integer.parseInt(vec[0]);
        int year = Integer.parseInt(vec[1]);
        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for  "+monthAndYear+": "+String.format("%.2f",worker.income(year,month)));


        sc.close();
    }
}
