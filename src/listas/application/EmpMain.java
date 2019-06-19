package listas.application;

import listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employee = null;
        System.out.print("How many employees? ");
        int cases = sc.nextInt();
        for(int i=0;i<cases;i++){
            System.out.printf("Employee #%d%n",i+1);
            System.out.print("id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();
            employeeList.add(i,new Employee(id,name,salary));
        }

        System.out.println();
        System.out.print("Enter the id employee: ");
        int id = sc.nextInt();
        Employee checkId = employeeList.stream().filter(employe->employe.getId()==id).findFirst().orElse(null);

        if(checkId!=null){
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            checkId.salaryIncrease(percentage,checkId.getSalary());
        }
        else {
            System.out.println("This id do not exists.");
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employee employee1:employeeList){
            System.out.println(employee1);
        }


        sc.close();
    }
}
