package com.kodilla.abstracts.homework;

public class Driver extends Job{
    public Driver(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void setResponsibilities() {
        System.out.println("Driving his vehicle ");
    }
}
