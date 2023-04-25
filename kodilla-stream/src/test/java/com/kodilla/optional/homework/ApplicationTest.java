package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void testGetTeacherName() {

//given
        Student student1 = new Student("Amy",new Teacher("Dona"));
        Student student2 = new Student("Amy",null);

//then
        assertEquals("Dona",Application.getTeacherName(student1));
        assertEquals("<undefined>",Application.getTeacherName(student2));



    }
}
