package academy.boostprogramme.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MileToKilometerConverterTest {

    MileToKilometerConverter mileToKilometerConverter = new MileToKilometerConverter();

    @ParameterizedTest
    @CsvSource({

            "1.61, 1.0",
            "2.415, 1.5",
            "-0.805, -0.5",
    })
    void convert(double expected, double input ) {
        double result = mileToKilometerConverter.convert(input);

        Assertions.assertEquals(expected, result);
    }
}