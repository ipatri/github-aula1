package entities;

import entities.enums.Color;

public abstract class Shape {
    private Color color;

    public abstract double area();

    public Shape(Color color) {
        this.color = color;
    }

}