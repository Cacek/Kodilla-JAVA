package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name = "Triangle";
    String radius;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public void getField() {
        System.out.println("Pole trojkata");
    }
}