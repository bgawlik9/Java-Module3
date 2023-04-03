package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Toyota toyota = new Toyota(0);
        doRace(toyota);
        Mazda mazda = new Mazda(0);
        doRace(mazda);
        Honda honda = new Honda (0);
        doRace(honda);

    }
    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
