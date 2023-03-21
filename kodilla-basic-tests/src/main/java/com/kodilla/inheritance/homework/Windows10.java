package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem{
    public Windows10(int yearOfPublication) {
        super(yearOfPublication);
    }

    @Override
    public void turnOn() {
        System.out.println("win 10 is on");
    }

    @Override
    public void turnOff() {
        System.out.println("win 10 is off");
    }
}
