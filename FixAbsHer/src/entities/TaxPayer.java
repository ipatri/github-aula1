package entities;

public abstract class TaxPayer {
    private String name;
    private Double anualIncome;

    public abstract Double tax();

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }
}
