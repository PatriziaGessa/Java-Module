package academy.boostprogramme.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class KilometerToMileConverterTest {

    KilometerToMileConverter kilometerToMileConverter = new KilometerToMileConverter();

    @ParameterizedTest
    @CsvSource({

            "0, 0",
            "0.31, 0.5",
    }
    )
    void convert(double input) {

        double result = kilometerToMileConverter.convert(input);
        Assertions.assertEquals(result,input);
    }
}