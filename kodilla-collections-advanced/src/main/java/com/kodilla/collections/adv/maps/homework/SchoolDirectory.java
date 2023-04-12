package com.kodilla.collections.adv.maps.homework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal,School> schoolAndPrincipal = new HashMap<>();

        Principal george = new Principal("George","Obama");
        Principal bill = new Principal("Bill","Bush");
        Principal joe = new Principal("Joe","Black");

        School school1 = new School(Arrays.asList(30,20));
        School school2 = new School(Arrays.asList(20,15,25));
        School school3 = new School(Arrays.asList(5,10));

        schoolAndPrincipal.put(george,school1);
        schoolAndPrincipal.put(bill,school2);
        schoolAndPrincipal.put(joe,school3);

        System.out.println(schoolAndPrincipal.get(george));
        for (Map.Entry<Principal, School> principalEntry : schoolAndPrincipal.entrySet()) {
            System.out.println(principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname() + " " + principalEntry.getValue().getSumOfStudents());
        }



    }
}
