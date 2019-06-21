package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(Double balance, String holder, Integer number, Double loanLimit) {
        super(balance, holder, number);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount() {
        super();
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loar(double amount){
        if(amount<=loanLimit){
            balance += amount -10.0;
        }
    }
}
