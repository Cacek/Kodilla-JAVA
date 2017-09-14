package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args) {

        ArrayList<Integer> theIntegers = new ArrayList<>();

//        Random theGenerator = new Random();
//        for (int n=0; n<200; n++){

        for (int n = 1; n <= 50; n++) {
            theIntegers.add(n);
        }

        OddNumbersExterminator evenArray = new OddNumbersExterminator();
        for (Integer iterator : evenArray.exterminate(theIntegers)) {
            System.out.println(iterator);
        }
    }
}