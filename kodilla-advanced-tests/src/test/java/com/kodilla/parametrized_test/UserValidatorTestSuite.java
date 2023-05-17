package com.kodilla.parametrized_test;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"test_name.32", "joe70_", "joe"})
    public void shouldReturnTrueWhenUsernameIsCorrect(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@JOE", "test_name<3", "Grzegorz_Brzeczeszczykiewicz", " "})
    public void shouldReturnFalseWhenUserNameIsIncorrect(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@mail.com", "t.test-10@test-domain.pl"})
    public void shouldReturnTrueWhenEmailAddressIsCorrect(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test'10@mail.com", "test@mail,com", "test@mail", "test.com", "test!@domain.pl"})
    public void shouldReturnFalseWhenEmailAddressIsIncorrect(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnWhenEmailAddressIsEmpty(String email) {
        assertFalse(userValidator.validateEmail(email));
    }


}
