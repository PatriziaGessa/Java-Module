package academy.boostprogramme.java.week3.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringStorageSizeCalculatorTest {

    StringStorageSizeCalculator stringStorageSizeCalculator = new StringStorageSizeCalculator();

    @ParameterizedTest
    @CsvSource({

            "64, Ciao",
            "528 , Supercalifragilistichespiralidoso",
            "176, NoBugNoFun!",
    })
    void calculate(int expected, String text) {
        int result = stringStorageSizeCalculator.calculate(text);

        Assertions.assertEquals(expected,result);
    }
}