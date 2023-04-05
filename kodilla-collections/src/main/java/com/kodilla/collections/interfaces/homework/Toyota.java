package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Toyota implements Car{
    private int speed;


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

    @Override
    public String toString() {
        return "Toyota{" +
                "speed=" + speed +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return speed == toyota.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

