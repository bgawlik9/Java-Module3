package com.kodilla.parametrized_test.homework;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiTestData {

    static Stream<Arguments> provideBmiTestData() {
        return Stream.of(
                Arguments.of(new Person(1.72,87),"Overweight"),
                Arguments.of(new Person(1.81,57),"Underweight"),
                Arguments.of(new Person(1.7,80),"Overweight"),
                Arguments.of(new Person(1.5,120),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.51,96),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.87,106),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.65,50),"Underweight"),
                Arguments.of(new Person(1.62,40),"Severely underweight"),
                Arguments.of(new Person(1.85,76),"Normal (healthy weight)"),
                Arguments.of(new Person(1.70,100),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.74,130),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.70,52),"Underweight"),
                Arguments.of(new Person(1.88,222),"Obese Class VI (Hyper Obese)"),
                Arguments.of(new Person(1.55,110),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.85,50),"Very severely underweight"),
                Arguments.of(new Person(1.66,80),"Overweight"),
                Arguments.of(new Person(2,65),"Underweight"),
                Arguments.of(new Person(1.67,100),"Obese Class II (Severely obese)")
        );
}
}
