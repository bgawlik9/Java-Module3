package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }


    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double subtractResult = calculator.subtract(a,b);
        assertEquals(-3, subtractResult);

    }
    @Test
    public void testSquare(){
        Calculator calculator = new Calculator();
        double a = 5.2;
        double b = 0;
        double c = -4;

        double squareResult = calculator.square(a);
        double squareResult1 = calculator.square(b);
        double squareResult2 = calculator.square(c);
        assertEquals(27.0,squareResult,0.1);
        assertEquals(0,squareResult1,0.1);
        assertEquals(16,squareResult2,0.1);

    }

}

