package academy.boostprogramme.java.week4.reflaction.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FromZeroRounderTest {

    FromZeroRounder fromZeroRounder = new FromZeroRounder();

    @ParameterizedTest
    @CsvSource({

            "-1, -0.1",
            "-2.0, -01.01",
            "-11.0, -10.11",
            "-1010.0,-1010.00",
            "0.0, 0.0",
            "2, 1.1",
            "67.0, 66.66",

    })
    void round(double expected, double input) {
        double result = fromZeroRounder.round(input);

        Assertions.assertEquals(expected, result);
    }
}