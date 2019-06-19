package listas.entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public void salaryIncrease(double percentage,double salary){
        this.salary = salary+((salary*percentage)/100);
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getId()
                +" "
                +getName()
                +" "
                +getSalary();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

