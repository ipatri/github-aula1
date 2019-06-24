package entities;

public class Individual extends TaxPayer {

    private Double healthExp;

    public Individual(String name, Double anualIncome, Double healthExp) {
        super(name, anualIncome);
        this.healthExp = healthExp;
    }

    @Override
    public Double tax() {
        double tax;
        if (super.getAnualIncome()<20000.00){
            tax = getAnualIncome()*0.15;
            if(healthExp!=0){
                tax += healthExp/2;
            }
        }
        else {
            tax = getAnualIncome()*0.25;
            if(healthExp!=0){
                tax += healthExp/2;
            }
        }
        return tax;
    }
}
