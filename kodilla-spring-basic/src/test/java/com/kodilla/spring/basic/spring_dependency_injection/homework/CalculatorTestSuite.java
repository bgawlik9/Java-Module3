package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    void shouldReturnProperResultOfAddOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(10.5, 5.5);
        Assertions.assertEquals(16, result);

    }

    @Test
    void shouldReturnProperResultOfSubtractOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(8.5, 5.5);
        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldReturnProperResultOfMultiplyOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(2, 1.5);
        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldReturnProperResultOfDivideOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(2, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldReturnProperResultOfDivideOperationWithZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(2, 0);
        Assertions.assertEquals(0, result);
    }
}
