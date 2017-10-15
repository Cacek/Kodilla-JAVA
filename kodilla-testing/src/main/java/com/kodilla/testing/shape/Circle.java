package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name = "Circle";
    String radius;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public void getField() {
        System.out.println("Pole kola");
    }
}
