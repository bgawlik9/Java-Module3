package com.kodilla.abstracts.homework;

public class Cashier extends Job{
    public Cashier(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void setResponsibilities() {
        System.out.println("Cashing products...");
    }
}
