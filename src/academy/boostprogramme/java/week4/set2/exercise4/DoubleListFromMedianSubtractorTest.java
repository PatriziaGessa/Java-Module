package academy.boostprogramme.java.week4.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListFromMedianSubtractorTest {

    DoubleListFromMedianSubtractor doubleListFromMedianSubtractor = new DoubleListFromMedianSubtractor();


    @Test
    void calculateReturnsZeroForOneEntry() {

        List<Double> input = List.of(4.5);

        List<Double> result = doubleListFromMedianSubtractor.calculate(input);

        List<Double> expected = List.of(0.0);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void calculateReturnsValuesForTwoEntries() {

        List<Double> input = List.of(3.5,5.5);

        List<Double> result = doubleListFromMedianSubtractor.calculate(input);

        List<Double> expected = List.of(-1.0, 1.0);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateReturnsValuesForFiveEntries() {
        List<Double> input = List.of(-5.5, 6.6, 1.5, 0.3, -9.0);

        List<Double> result = doubleListFromMedianSubtractor.calculate(input);

        List<Double> expected = List.of(-5.8, 6.3, 1.2, 0.0, -9.3);

        Assertions.assertEquals(expected, result);
    }
}