package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.util.Scanner;
import java.util.logging.Handler;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the full path: ");
        String path = sc.next();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            do {
                String[] vec = line.split(" ");
                LogEntry.addLog(new LogEntry(vec[0], Date.from(Instant.parse(vec[1]))));
                line = br.readLine();
            } while (line != null);
            LogEntry.users();
        }
        catch (IOException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
