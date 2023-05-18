package ru.netology.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IntsCalculatorTests {
    static IntsCalculator intsCalculator;

    @BeforeAll
    public static void beforeAll() {
        intsCalculator = new IntsCalculator();
    }

    @ParameterizedTest
    @MethodSource("sumMethodSource")
    public void parametrizedTestSum(int arg0, int arg1, int sum) {
        //arrange
        int result;
        int expected = sum;

        //act
        result = intsCalculator.sum(arg0, arg1);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("multMethodSource")
    public void parametrizedTestMult(int arg0, int arg1, int product) {
        //arrange
        int result;
        int expected = product;

        //act
        result = intsCalculator.mult(arg0, arg1);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("powMethodSource")
    public void parametrizedTestPow(int arg0, int arg1, int power) {
        //arrange
        int result;
        int expected = power;

        //act
        result = intsCalculator.pow(arg0, arg1);

        //assert
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> sumMethodSource() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(10, 22, 32)
        );
    }

    public static Stream<Arguments> multMethodSource() {
        return Stream.of(
                Arguments.of(2, 5, 10),
                Arguments.of(-1, 4, -4),
                Arguments.of(-3, -3, 9),
                Arguments.of(7, -2, -14),
                Arguments.of(0, 20, 0)
        );
    }

    public static Stream<Arguments> powMethodSource() {
        return Stream.of(
                Arguments.of(1, 0, 1),
                Arguments.of(4, 2, 16),
                Arguments.of(-3, 3, -27),
                Arguments.of(-2, 4, 16)
        );
    }
}