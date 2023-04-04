package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarName(car));
        System.out.println("Car speed is: " + car.getSpeed());

    }
    private static String getCarName(Car car) {
        if (car instanceof Honda)
            return "Honda";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Mazda)
            return "Mazda";
        else
            return "Unknown car brand";
    }
}
