package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    //tworzenie danych testowych
    public ShapeCollector createDummyData() {

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle());
        shapeCollector.addFigure(new Triangle());
        shapeCollector.addFigure(new Square());

        return shapeCollector;
    }

    //test dodawania figury do kolekcji
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector test = createDummyData();

        //When
        test.addFigure(new Circle());

        //Then
        Assert.assertEquals(4, test.getSize());
    }

    //test usuwania z kolekcji
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector test = createDummyData();
        Shape toRemove = new Circle();
        test.addFigure(toRemove);
        Assert.assertEquals(4, test.getSize());
        //When
        test.removeFigure(toRemove);

        //Then
        Assert.assertEquals(3, test.getSize());
    }

    //test pobieranie figury z kolekcji
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector test = createDummyData();

        //When
        Shape result = test.getFigure(0);

        //Then
        Assert.assertTrue(result instanceof Circle);
    }

    //test wyswietlanie  kolekcji
    @Test
    public void testShowFigure() {
        //Given
        ShapeCollector test = createDummyData();

        //When


        //Then
        test.showFigures();
    }
}
