package Entities;

public class contaB {
    private int account;
    private String name;
    private double balance;

    public contaB(int account, String name, double initialDeposit) {
        this.account = account;
        this.name = name;
        deposit(initialDeposit);
    }

    public contaB(int account, String name) {
        this.account = account;
        this.name = name;
    }
    public String toString() {
        return "Account "
                +account
                + ", Holder:"
                + String.format(getName())
                + ", Balance: $"
                + String.format("%.2f", getBalance());

    }
    public void deposit(double deposit){
        this.balance += deposit;
    }
    public void withdraw(double withdraw){
        this.balance -= (withdraw+5);
    }


    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
