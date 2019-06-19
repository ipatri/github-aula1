package Application;

import Entities.contaB;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number:");
        int accNum = sc.nextInt();
        System.out.print("Enter account number:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n):");
        contaB account;
        char op = sc.next().charAt(0);
        if(op == 'y'){
            System.out.print("Enter initial deposit:");
            double initialDeposit = sc.nextDouble();
            account = new contaB(accNum,name,initialDeposit);
        }
        else{
            account = new contaB(accNum,name);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated Account data:");
        System.out.println(account);
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated:");
        System.out.println(account);
        sc.close();
    }
}
