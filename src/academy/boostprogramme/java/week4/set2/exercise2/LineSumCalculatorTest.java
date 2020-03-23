package academy.boostprogramme.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LineSumCalculatorTest {

    LineSumCalculator lineSumCalculator = new LineSumCalculator();

    @ParameterizedTest
    @CsvSource({

            "0, ''",
            "1, 1",
            "3, 1;1;1",
            "-15, -5;-5;-5",
            "-5, 5;-5;-5",
            "5, 5;5;-5",


    })
    void calculate(int expected, String input) {

        int result = lineSumCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }
}