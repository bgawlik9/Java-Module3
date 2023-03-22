package com.kodilla.abstracts.homework;

public abstract class Job {
int salary;
String responsibilities;

    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public abstract void setResponsibilities();

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}
