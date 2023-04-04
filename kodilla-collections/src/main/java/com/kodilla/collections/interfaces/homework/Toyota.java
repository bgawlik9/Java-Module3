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
        if(this.speed > 180)
        {
            System.out.println("Juz więcej nie pojedzie");
            this.speed = 180;
        }

    }

    @Override
    public void decreaseSpeed() {
        this.speed -=10;
        if(this.speed <= 0) {
            System.out.println("Stoimy!");
            this.speed = 0;

        }

    }
}
