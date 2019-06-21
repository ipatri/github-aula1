package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//    public Double total(){
//
//    }

    private Date moment = new Date();

    private OrderStatus status;
    List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }
}
