package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Policeman policeman = new Policeman(2600,"catching badguys");
        Driver driver = new Driver(2550,"driving");
        Cashier cashier = new Cashier(23333,"cashing");
        Person person = new Person("jessica",28,policeman);
            person.showResponsibilities(policeman);

    }
}
