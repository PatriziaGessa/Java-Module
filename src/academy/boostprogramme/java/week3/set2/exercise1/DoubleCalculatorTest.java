package academy.boostprogramme.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCalculatorTest {

    DoubleCalculator doubleCalculator = new DoubleCalculator();

    @ParameterizedTest
    @CsvSource({

            "10.5, 5.25, 5.25",
            "0.50, 0.25, 0.25",
            "18.16, 9.08, 9.08"
    })
    void sumDouble(double expected, double input1, double input2) {

        double result = doubleCalculator.sumDouble(input1, input2);

        Assertions.assertEquals(expected,result);


    }
}