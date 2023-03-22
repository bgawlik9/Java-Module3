package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a =5;
        int b =8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13,sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawanie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b );
        }

        int subtractResult = calculator.subtract(a,b);
        boolean correctSubtract = ResultChecker.assertEquals(-3,subtractResult);
        if (correctSubtract){
            System.out.println("Metoda subtract działa poprawanie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b );
        }

        int squareResult = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(25,squareResult);
        if (correctSquare){
            System.out.println("Metoda square działa poprawanie dla liczby " + a );
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczby " + a );
        }
        }

        }


