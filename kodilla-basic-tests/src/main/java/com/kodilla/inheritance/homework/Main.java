package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {

    Windows7 win7 = new Windows7(2007);
        System.out.println(win7.getYearOfPublication());
    Windows10 win10 = new Windows10(2010);
        System.out.println(win10.getYearOfPublication());
    }
}
