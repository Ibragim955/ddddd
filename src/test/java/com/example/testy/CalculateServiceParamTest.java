package com.example.testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculateServiceParamTest {
    private final CalculateService calculateService = (CalculateService) new CalculateServiceImpl();

    @ParameterizedTest
    @MethodSource("provideArgumentsForSum")
    public void shouldReturnCorrectResultWhenSum(int num1, int num2, int expected) {
        int result = calculateService.plus(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"8, 4, 4", "2, 1, 1", "4, 4, 0"})
    public void shouldReturnCorrectResultWhenMinus(int num1, int num2, int expected) {
        int result = calculateService.minus(num1, num2);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"2, 4, 8", "2, 1, 2", "4, 4, 16"})
    public void shouldReturnCorrectResultWhenMultiplay(int num1, int num2, int expected) {
        int result = calculateService.multiplay(num1, num2);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"4, 4, 1", "2, 1, 2", "4, 2, 2 "})
    public void shouldReturnCorrectResultWhenDevide(int num1, int num2, int expected) {
        int result = calculateService.devide(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> provideArgumentsForSum() {
        return Stream.of(
                Arguments.of(2, 4, 6),
                Arguments.of(7, 8, 15),
                Arguments.of(12, 13, 25),
                Arguments.of(1, 2, 3)
        );
    }

}

