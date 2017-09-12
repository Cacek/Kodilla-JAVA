package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int sum = calculator.add(2, 2);

        if (sum == 4) {
            System.out.println("2 + 2 = 4 - ok");
        } else {
            System.out.println("Error!");
        }

        int sub = calculator.subtract(2, 2);

        if (sub == 0) {
            System.out.println("2 - 2 = 0 - ok");
        } else {
            System.out.println("Error!");
        }
    }
}
