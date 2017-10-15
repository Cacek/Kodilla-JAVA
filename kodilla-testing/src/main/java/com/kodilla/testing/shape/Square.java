package com.kodilla.testing.shape;

public class Square implements Shape {
    String name = "Square";
    String radius;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public void getField() {
        System.out.println("Pole kwadratu");
    }
}