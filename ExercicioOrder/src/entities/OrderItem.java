package entities;
import entities.Product;

public class OrderItem {
    private Product product;
    private Integer quantity;
    private Double price;


    public Double subTotal(){
        return quantity*price;
    }

    public OrderItem(Integer quantity,Double price,Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price=price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
