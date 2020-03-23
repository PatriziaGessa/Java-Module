package academy.boostprogramme.java.week4.set2.exercise3;

import academy.boostprogramme.java.week3.reflaction.exercise1.DoubleListSumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMedianCalculatorTest {

   DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();

    @Test
    void calculateReturnsASingleEntryForListWithOneEntry() {
        List<Double> doubles = List.of(5.3);

        double result = doubleListMedianCalculator.calculate(doubles);

        double expected = 5.3;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateReturnsAverageForListWithTwoEntries () {
        List<Double> doubles = List.of(4.5, 5.4);

        double result = doubleListMedianCalculator.calculate(doubles);

        double expected = 4.95;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateReturnsMiddleEntryForListWithMultipleEntry() {
        List<Double> doubles = List.of(3.0, 2.1, 1.2, 0.3);

        double result = doubleListMedianCalculator.calculate(doubles);
        double expected = 1.65;

        Assertions.assertEquals(expected, result);
    }




}