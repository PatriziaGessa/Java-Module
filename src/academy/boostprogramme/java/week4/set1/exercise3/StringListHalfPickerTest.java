package academy.boostprogramme.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListHalfPickerTest {

    StringListHalfPicker stringListHalfPicker = new StringListHalfPicker();

    @Test
    void pickReturnsFromTrueHalfForEvenElementCount() {

        List<String> strings = List.of("one", "two", "three", "four");

        String result = stringListHalfPicker.pick(strings);

        List<String> expected = List.of("one" , "two");
        Assertions.assertTrue(expected.contains(result));
    }

    @Test
    void pickReturnsFromSmallerHalfForOddElementCount() {
        List<String> strings = List.of("one", "two", "three");

        String result = stringListHalfPicker.pick(strings);

        List<String> expected = List.of("one");
        Assertions.assertTrue(expected.contains(result));

    }

    @Test
    void pickReturnsSingleEntryForListContainsOneElement() {
        List<String> strings = List.of("one");

        String result = stringListHalfPicker.pick(strings);

        String expected = "one";
        Assertions.assertEquals(expected,result);


    }
}