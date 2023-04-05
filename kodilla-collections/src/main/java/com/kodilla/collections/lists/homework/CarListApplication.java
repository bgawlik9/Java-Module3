package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarListApplication {
    public static void main(String[] args) {

        List<Toyota> toyotas = new ArrayList<>();

        toyotas.add(new Toyota(0));
        toyotas.add(new Toyota(0));
        toyotas.add(new Toyota(2));
        toyotas.add(new Toyota(2));
        toyotas.add(new Toyota(1));
        Toyota toyota1 = new Toyota(2);
        toyotas.remove(2);
        toyotas.remove(toyota1);

        for (Toyota toyota: toyotas)
        {
            describeCar(toyota);

        }

        System.out.println("ilosc elementów w liscie wynosi : " + toyotas.size());
    }
}
