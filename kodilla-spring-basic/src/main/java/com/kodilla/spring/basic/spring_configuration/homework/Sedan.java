package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(String timeOfDay) {
        if (timeOfDay.equalsIgnoreCase("day")) {
            return false;
        }
        return true;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
