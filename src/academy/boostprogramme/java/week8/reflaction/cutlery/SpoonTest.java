package academy.boostprogramme.java.week8.reflaction.cutlery;

import academy.boostprogramme.java.week7.set2.exercise4.StreamFileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SpoonTest {

    Cutlery spoon = new Spoon();

    @Test
    void getName() {
        Assertions.assertEquals("spoon", spoon.getName());
    }

    @ParameterizedTest
   @MethodSource("parameters")
    void isUsedFor(boolean expected, String dish) {
        boolean result = spoon.isUsedFor(dish);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, "Soup"),
                Arguments.of(true, "soup"),
                Arguments.of(true, "SOUP"),
                Arguments.of(false, ""),
                Arguments.of(false, "Fish"),
                Arguments.of(false, "123")
        );
    }


}