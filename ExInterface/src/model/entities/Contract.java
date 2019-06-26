package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Date date;
    private Double value;
    private Integer number;

    private List<Installments>installments=new ArrayList<>();

    public Contract(Date date, Double value, Integer number) {
        this.date = date;
        this.value = value;
        this.number = number;
    }

    public void addInstallments(Installments installments){
        this.installments.add(installments);
    }
    public void removeInstallments(Installments installments){
        this.installments.remove(installments);
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Installments> getInstallments() {
        return installments;
    }
}
