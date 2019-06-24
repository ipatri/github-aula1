package entities;

public class Company extends TaxPayer {

    private int empNumbers;

    public Company(String name, Double anualIncome, int empNumbers) {
        super(name, anualIncome);
        this.empNumbers = empNumbers;
    }

    @Override
    public Double tax() {
        if (empNumbers>10){
         return getAnualIncome()*0.14;
        }
        else {
            return getAnualIncome()*0.16;
        }
    }
}
