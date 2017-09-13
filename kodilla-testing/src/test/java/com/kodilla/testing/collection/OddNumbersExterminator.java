package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers) {
        int counter = 0;
        for (int n = 0; n < numbers.size(); n++) {
            counter = numbers.get(n);
            if (counter % 2 != 0) {
                System.out.println(counter);
            }
        }
    }
}