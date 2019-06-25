package application;

import model.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account acc = new Account(number,holder,initialBalance,withdrawLimit);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println();
            System.out.print("New balance: "+acc.getBalance());

        }
        catch (Error e){
            System.out.println("Withdraw error: "+e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
