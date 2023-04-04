package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarApplication {


    public static void main(String[] args) {
        Random random = new Random();
        Car [] cars = new Car[random.nextInt(15)+1];
        for (int i = 0; i < cars.length; i++) {
        cars[i] = drawCar();
            System.out.println(cars[i]);
        }
        for(Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar(){
        Random random = new Random();
        int drawCarBrand = random.nextInt(3);
        int speed = random.nextInt(180);
        if(drawCarBrand == 0)
            return new Honda(speed);
        else if (drawCarBrand == 1)
            return new Mazda(speed);
        else {
            return new Toyota(speed);
        }

    }


}
