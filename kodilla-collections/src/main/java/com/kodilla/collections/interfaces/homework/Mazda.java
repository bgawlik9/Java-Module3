package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car{
    int speed;

    public Mazda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed +=5;

    }

    @Override
    public void decreaseSpeed() {
        this.speed -=5;

    }
}
