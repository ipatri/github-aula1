package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape>shapes=new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data:%n",i+1);
            System.out.print("Rectangle or Circle: r/c ");
            char typeOfShape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.nextLine();
            Color color= Color.valueOf(sc.nextLine());
            if(typeOfShape=='r'){
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                shapes.add(new Rectangle(color,width,height));
            }
            else if(typeOfShape=='c'){
                double radius = sc.nextDouble();
                shapes.add(new Circle(color,radius));
            }
        }
        System.out.println("SHAPE AREAS:");
        for (Shape s: shapes){
            System.out.println(String.format("%.2f",s.area()));
        }

        sc.close();
    }
}
