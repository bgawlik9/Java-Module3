package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{
    int speed;

    public Toyota(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed +=10;

    }

    @Override
    public void decreaseSpeed() {
        this.speed -=10;

    }
}
