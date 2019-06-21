package entities;

public class Account {
    protected Double balance;
    private String holder;
    private Integer number;

    public Account() {
    }

    public Account(Double balance, String holder, Integer number) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public  void withdraw(double amount){
        balance-=amount+5;
    }
    public  void deposit(double amount){
        balance+=amount;
    }
}
