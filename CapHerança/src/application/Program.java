package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
//        AULA 1
//
//        Account acc= new Account(0.0,"Alex",1001);
//        BusinessAccount bacc = new BusinessAccount(0.0,"Maria",1002,500.00);
//
//        //UPCASTING
//
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(00.00,"Bob",1003,200.00);
//        Account acc3 = new SavingsAccount(00.00,"Anna",1004,0.01);
//
//        //DOWNCASTING
//
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc4.loan(100.00);
//
////        BusinessAccount acc5 = (BusinessAccount) acc3;
//
//        if(acc3 instanceof  BusinessAccount){
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(200.00);
//            System.out.println("Loan!");
//        }
//
//        if(acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("Balance!");
//        -----------------------------------------------------------------------------
        Account acc1 = new Account(1000.0,"Alex",1001);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1000.00,"Maria",1002,0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1000.0,"Bob",1034,500.00);
        acc3.withdraw(200.);
        System.out.println(acc3.getBalance());
    }
}

