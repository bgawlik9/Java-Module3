package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    double a;
    double b;
    double c;
    @Override
    double Area() {
        return ( a * b) / 2 ;
    }

    @Override
    double Perimeter() {
        return a + b + c;
    }
}
