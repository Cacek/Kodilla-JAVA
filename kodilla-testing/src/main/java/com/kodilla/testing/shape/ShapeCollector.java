package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollector {

    ArrayList<Shape> arrayOfShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        arrayOfShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        if (arrayOfShapes.contains(shape))
            arrayOfShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return arrayOfShapes.get(n);
    }

    public void showFigures() {
        arrayOfShapes.stream()
                .map(s -> s.getShapeName())
                .forEach(System.out::println);

//        for (int i = 0; i < arrayOfShapes.size(); i++) {
//            Shape temp = arrayOfShapes.get(i);
//
//            System.out.println(temp);
//        }
    }

    public int getSize() {
        return arrayOfShapes.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return arrayOfShapes.equals(that.arrayOfShapes);
    }

}
