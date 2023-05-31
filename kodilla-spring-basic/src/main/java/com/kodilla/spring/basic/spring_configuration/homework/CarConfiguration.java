package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarConfiguration {

    private String season;
    private String timeOfDay;

    public void getSeason(int month) {
        if (month <= 2 || month == 12) {
            season = "winter";
        } else if (month <= 5) {
            season = "spring";
        } else if (month <= 8) {
            season = "summer";
        } else {
            season = "autumn";
        }
    }

    public void getTime(int hour) {
        if (hour < 20 && hour > 6) {
            timeOfDay = "day";
        } else {
            timeOfDay = "night";
        }
    }

    public LocalDate getLocalDate() {
        return LocalDate.of(2023, 5, 30);
    }

    public LocalTime getLocalTime() {
        return LocalTime.of(3, 0);
    }

    @Bean
    public Car getCarForSeasonAndTime() {
        getSeason(getLocalDate().getMonthValue());
        getTime(getLocalTime().getHour());
        Car car;
        if (season.equalsIgnoreCase("winter")) {
            car = new Suv();
        } else if (season.equalsIgnoreCase("summer")) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        boolean turnOnLights = car.hasHeadlightsTurnedOn(timeOfDay);
        String lights;
        if (turnOnLights) {
            lights = " and lights are on.";
        } else {
            lights = " and lights are off.";
        }
        System.out.println("It's " + season + ". Driving " + car.getCarType() + lights);
        return car;
    }


}
