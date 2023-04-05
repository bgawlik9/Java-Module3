package com.kodilla.collections.sets.homework;


import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps  = new HashSet<>();

        stamps.add(new Stamp("Geralt z Rivii",20,10,false));
        stamps.add(new Stamp("Gen.Kutrzeba",30,15,true));
        stamps.add(new Stamp("Obi Wan Kenobi",25,10,false));
        stamps.add(new Stamp("Kulfon",24,12,true));
        stamps.add(new Stamp("Kulfon",24,12,true));
        stamps.add(new Stamp("Geralt z Rivii",20,10,false));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps) {
            System.out.println(stamp);



        }

    }
}
