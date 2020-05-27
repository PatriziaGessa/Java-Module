package academy.boostprogramme.java.week8.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    Operator subtraction = new Subtraction();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, 3, 1),
                Arguments.of(1, 2, 1),
                Arguments.of(0, 1, 1),
                Arguments.of(-1, 0, 1)
        );
    }

    @Test
    void getSymbol() {
        Assertions.assertEquals("-", subtraction.getSymbol());
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void operate(double expected, double number1, double number2) {
        double result = subtraction.operate(number1, number2);
        Assertions.assertEquals(expected, result);
    }
}