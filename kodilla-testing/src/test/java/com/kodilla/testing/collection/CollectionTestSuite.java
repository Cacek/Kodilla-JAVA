package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator evenArray = new OddNumbersExterminator();
        ArrayList<Integer> empty = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = evenArray.exterminate(empty);
        //Then
        Assert.assertEquals(0, result.size());

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator evenArray = new OddNumbersExterminator();
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(4);
        input.add(3);
        input.add(9);
        //When
        ArrayList<Integer> result = evenArray.exterminate(input);
        //Then
        Assert.assertEquals(2, result.size());
    }
}
