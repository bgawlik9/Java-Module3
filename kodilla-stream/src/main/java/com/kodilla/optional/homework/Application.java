package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Joe", new Teacher("Tony")));
        studentsList.add(new Student("Mick", null));
        studentsList.add(new Student("Andrew", null));
        studentsList.add(new Student("David", new Teacher("Adam")));




            for (Student students : studentsList) {

                Optional<Teacher> optionalTeacher =
                        Optional.ofNullable(students.getTeacher());

                Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));

                System.out.println("Student: " + students.getName() + ", Teacher: " + teacher.getName());

            }


      getTeacherName(studentsList.get(1));

        }

    public static String getTeacherName (Student student){

        Optional<Teacher> optionalTeacher =
                Optional.ofNullable(student.getTeacher());

        Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));
        System.out.println( "teacher:  "  +  teacher.getName());
        return teacher.getName();
    }

        }


