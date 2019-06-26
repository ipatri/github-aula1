package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installments {
    private Date dueDates;
    private Double amount;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Installments(Date dueDates, Double amount) {
        this.dueDates = dueDates;
        this.amount = amount;
    }

    public Date getDueDates() {
        return dueDates;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return sdf.format(dueDates)+" - "+String.format("%.2f",amount);
    }
}
