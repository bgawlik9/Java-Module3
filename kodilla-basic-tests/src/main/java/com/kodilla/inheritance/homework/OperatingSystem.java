package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int yearOfPublication;

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public OperatingSystem(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void turnOn() {
        System.out.println("Operating system is on");
    }
    public void turnOff() {
        System.out.println("Operating system is off");
        }
}
