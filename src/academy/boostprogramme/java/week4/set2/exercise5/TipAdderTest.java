package academy.boostprogramme.java.week4.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TipAdderTest {

    TipAdder tipAdder = new TipAdder();

    @ParameterizedTest
    @CsvSource({
            "0.0, 0.0",
            "0.5, 0.2",
            "1.5, 0.99",
            "3.5, 3.06",
            "11.5, 10.50",


    })
    void add(double expected, double amount ) {
        double result = tipAdder.add(amount);

        Assertions.assertEquals(expected, result);
    }
}