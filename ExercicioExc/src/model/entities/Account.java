package model.entities;

import model.exception.Error;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(Double amount){
        if(withdrawLimit<amount){
            throw new Error("Amount above limit.");
        }
        if(amount>balance){
            throw new Error("Amount over limit.");
        }
        balance-=amount;
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }
}
