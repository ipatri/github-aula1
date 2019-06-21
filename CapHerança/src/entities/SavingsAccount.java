package entities;

public class SavingsAccount extends Account {
    private Double interestRate;

    public void updateBalance(){
        balance += balance*interestRate;
    }
    @Override
    public void withdraw(double amount){
        this.balance -= amount;
    }
    

    public SavingsAccount(Double balance, String holder, Integer number, Double interestRate) {
        super(balance, holder, number);
        this.interestRate = interestRate;
    }

    public SavingsAccount() {
        super();
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
