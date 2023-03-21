package com.kodilla.abstracts.homework;

public class Square extends Shape {

    double a;

    @Override
    double Area() {
        return a * a;
    }

    @Override
    double Perimeter() {
        return 4 * a;
    }
}
