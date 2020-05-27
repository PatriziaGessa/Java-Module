package academy.boostprogramme.java.week8.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    Operator sum = new Sum();

    @Test
    void getSymbol() {
        Assertions.assertEquals("+", sum.getSymbol());
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void operate(double expected, double number1, double number2) {
        double result = sum.operate(number1, number2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0, 0, 0),
                Arguments.of(1, 1, 0),
                Arguments.of(2, 1, 1),
                Arguments.of(3, 2, 1)
        );
    }
}