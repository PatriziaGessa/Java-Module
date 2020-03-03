package academy.boostprogramme.java.week3.set2.exercise2;

import academy.boostprogramme.java.week2.set2.exercise4.DistanceCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisionCalculatorTest {

    DivisionCalculator divisionCalculator = new DivisionCalculator();

    @ParameterizedTest
    @CsvSource({

            "5.1, 25.5, 5.0",
            "0.5, 0.50, 1.0",
            "5.25, 10.5, 2.0",
    })
    void divide(double expected, double input1, double input2) {

        double result = divisionCalculator.divide(input1, input2);
        Assertions.assertEquals(expected, result);
    }
}