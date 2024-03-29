package entities;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;

    @Override
    public Double payment(){
        return hours * valuePerHour + (additionalCharge*1.1);
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
}
