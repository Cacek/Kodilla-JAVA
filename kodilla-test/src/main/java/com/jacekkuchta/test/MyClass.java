package com.jacekkuchta.test;

import java.util.ArrayList;

public class MyClass {
        public void printEven(ArrayList<String> theEven){
            int temporaryValue = 0;
            for (int n=0; n < theEven.size(); n++){
                temporaryValue = theEven.get(n).length();
                //checking if an element is even or odd
                if (temporaryValue % 2 == 0){
                    //if reminder of dividing the element by two equals 0,
                    //the element is even, so we can print out it.
                    System.out.println(temporaryValue);
                }
            }
        }
    }

