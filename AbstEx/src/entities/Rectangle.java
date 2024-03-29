package entities;


import entities.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;


    @Override
    public double area() {
        return width*height;
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
}
