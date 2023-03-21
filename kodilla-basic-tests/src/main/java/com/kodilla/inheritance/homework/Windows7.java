package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem {

    public Windows7(int yearOfPublication) {
        super(yearOfPublication);
    }

    @Override
    public void turnOn() {
        System.out.println("win7 is on");
    }

    @Override
    public void turnOff() {
        System.out.println("win7 is off");
    }
}
