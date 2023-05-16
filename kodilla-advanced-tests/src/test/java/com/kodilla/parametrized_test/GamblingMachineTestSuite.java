package com.kodilla.parametrized_test;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {


    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnCorrectNumberOfWins(String numbers) throws InvalidNumbersException {
        Set<Integer> set = new HashSet<>();
        String[] splittedString = numbers.split(" ");
        for (String num : splittedString) {
            set.add(Integer.parseInt(num));
        }
        int wins = gamblingMachine.howManyWins(set);

        assertTrue(wins >= 0 && wins <= 6);
        System.out.println(gamblingMachine.generateComputerNumbers());
        assertEquals(wins, gamblingMachine.howManyWins(set));
    }






    @ParameterizedTest
    @CsvFileSource(resources = "/notValidatedUserNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenNumbersAreNotValidated(String number) throws InvalidNumbersException {
        Set<Integer> set = new HashSet<>();
        String[] splittedString = number.split(" ");

        for (String num : splittedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldThrowExceptionWhenSetIsNullOrEmpty(Set<Integer> input) {
        Set<Integer> set = new HashSet<>();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(set));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooSmallSet.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenSetIsTooSmall(String number) throws InvalidNumbersException {
        Set<Integer> set = new HashSet<>();
        String[] splittedString = number.split(" ");

        for (String num : splittedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooBigSet.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenSetIsTooBig(String number) throws InvalidNumbersException {
        Set<Integer> set = new HashSet<>();
        String[] splittedString = number.split(" ");

        for (String num : splittedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
            System.out.println(set);
        });
    }

}
