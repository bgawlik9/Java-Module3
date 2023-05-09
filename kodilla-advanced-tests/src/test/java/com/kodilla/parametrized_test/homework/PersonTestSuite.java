package com.kodilla.parametrized_test.homework;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_test.homework.BmiTestData#provideBmiTestData")
    public void shouldReturnProperString(Person person, String expected){
        assertEquals(expected, person.getBMI());
    }
}
