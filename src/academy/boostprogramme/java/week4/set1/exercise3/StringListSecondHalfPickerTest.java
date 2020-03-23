package academy.boostprogramme.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListSecondHalfPickerTest {

    StringListSecondHalfPicker stringListSecondHalfPicker = new StringListSecondHalfPicker();

    @Test
    void pickReturnsFromTrueHalfForEvenElementCount() {
        List<String> strings = List.of("first", "second", "third", "fourth" );

        String result = stringListSecondHalfPicker.pick(strings);

        List<String> expected = List.of("third", "fourth");
        Assertions.assertTrue(expected.contains(result), result);
    }

    @RepeatedTest(10)
    void pickReturnsFromBiggerHalForOddElementCount() {
        List<String> strings = List.of("first", "second","third", "fourth", "fifth");

        String result = stringListSecondHalfPicker.pick(strings);

        List<String> expected = List.of("third", "fourth", "fifth");

        Assertions.assertTrue(expected.contains(result), result);

    }

    @Test
    void pickReturnSingleEntryForListThatContainsONeElement() {
        List<String> strings = List.of("hello");

        String result = stringListSecondHalfPicker.pick(strings);

        String expected = "hello";

        Assertions.assertEquals(expected, result);





    }
}