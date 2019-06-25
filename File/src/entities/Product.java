package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Double totalPrice(){
        return price*quantity;
    }

    public String getName() {
        return name;
    }
}
