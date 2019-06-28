package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String path = "/home/isaq/Documentos/in.csv";
        List<Employee> employees = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            do{
                String[] vec = line.split(",");
                employees.add(new Employee((vec[0]),Double.parseDouble(vec[1])));
                line = br.readLine();
            }while (line!=null);
            Collections.sort(employees);
            for(Employee n:employees){
                System.out.println(n.getName()+" ,"+n.getSalary());
            }
        }
        catch (IOException e){
            System.out.println("erro : "+e.getMessage());
        }
    }
}
