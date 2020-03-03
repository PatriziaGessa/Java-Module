package academy.boostprogramme.java.week3.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "-4, -2, 2",
    })
    void calculate(double expected, double base, int exponent) {
        double result = powerCalculator.calculate(base, exponent);

        Assertions.assertEquals(expected, result);
    }
}