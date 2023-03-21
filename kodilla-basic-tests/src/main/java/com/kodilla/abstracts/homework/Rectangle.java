package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
 double a;
 double b;

    @Override
    double Area() {
        return a*b;
    }

    @Override
    double Perimeter() {
        return 2 * a + 2 * b;
    }
}
