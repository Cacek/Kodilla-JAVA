package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = calculator.add(1,1);
        double s = calculator.sub(2,2);
        double m = calculator.mul(3,3);
        double d = calculator.div(20,2);
        //Then
        Assert.assertEquals(2, a, 0);
        Assert.assertEquals(0, s, 0);
        Assert.assertEquals(9, m, 0);
        Assert.assertEquals(10, d, 0);
    }
}
