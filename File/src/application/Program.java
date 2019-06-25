package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = "/home/isaq/Documentos/in.csv";
        List<Product>products=new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            do{
                String[] vec = line.split(",");
                products.add(new Product(vec[0],Double.parseDouble(vec[1]),Integer.parseInt(vec[2])));
                line = br.readLine();
            }while (line!=null);
        }
        catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        File filePath = new File(path);
        String outPath = filePath.getParent()+"/out";
        boolean sucess = new File(outPath).mkdir();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(outPath+"/out.csv"))){
            for(Product product:products){
                bw.write(product.getName()+","+String.format("%.2f",product.totalPrice()));
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            System.out.println(sucess);
        }
    }
}
