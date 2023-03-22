package com.kodilla.abstracts.homework;

public class Policeman extends Job{
    public Policeman(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void setResponsibilities() {
        System.out.println("Catching thiefs and bandids");
    }
}
