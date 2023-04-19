package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;


public class School {

    int klass;
   private List<Integer> studentsInClass = new ArrayList<>();

    public School(List<Integer> students) {
        this.studentsInClass = students;
    }
    public int getSumOfStudents() {
        int sum = 0;
        for (int student : studentsInClass)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return " stundents in each class " + studentsInClass.toString();
    }

}
