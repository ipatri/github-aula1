package application;

import java.io.File;
import java.util.Scanner;

public class ProgramExemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a path");
        String strpath = sc.nextLine();
        File path = new File(strpath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for(File folder:folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");
        for (File file:files){
            System.out.println(file);
        }

        boolean suc = new File(strpath+"/pastinha").mkdir();
        System.out.println(suc);
    }
}
