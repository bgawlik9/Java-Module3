package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    Job job;

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
}
