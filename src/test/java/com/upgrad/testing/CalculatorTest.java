package com.upgrad.testing;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.CoreMatchers.*;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
        System.out.println("Creating new calculator object");
    }

    @Test
    @DisplayName("should Return Addition For Positive Number")
    void shouldReturnAdditionForPositiveNumber() {
        // Arrange
        calculator = new Calculator();
        // Act - When
        int result = calculator.add(5, 7);
        // some preparation
        // Assert - Then
        assertEquals(12, result);
    }

    @Test
    void shouldReturnAdditionForNegativeNumber() {
        // Act - When
        int result = calculator.add(-5, 7);
        // Assert - Then
        assertEquals(2, result);
    }

    @ParameterizedTest
    @CsvSource({"5,7,12", "5,-7,-2", "-5,7,2", "-5,-7,-12"})
    void shouldReturnAdditionForGivenNumbers(int a, int b, int expectedResult) {
        int result = calculator.add(a, b);
        // Assert - Then
        assertEquals(a + b, result); // 1
        assertThat(result, is(expectedResult)); // 2
    }

    @Test
    void shouldReturnDivisionForGivenNumbers() {
        int result = calculator.divide(3, 4);
        assertEquals(3 / 4, result);
    }

    @Test
    void shouldThrowExceptionWhenDividedByZero() {
        assertThrows(Exception.class, () -> {
            calculator.divide(3, 0);
        });
    }

    @Test
    void shouldReturnZeroWhenDividedToZero() {

        int result = calculator.divide(0, 3);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroWhenInputIsZero() {
        int result = calculator.someMethodWithLoop(0);
        assertEquals(0, result);
    }
}