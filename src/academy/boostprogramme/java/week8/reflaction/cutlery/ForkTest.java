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

class ForkTest {

    Cutlery fork = new Fork();

    @Test
    void getName() {
        Assertions.assertEquals("Fork", fork.getName());
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void isUsedFor(boolean expected, String dish) {
        boolean result = fork.isUsedFor(dish);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, "Fish"),
                Arguments.of(true, "fish"),
                Arguments.of(true, "FISH"),
                Arguments.of(true, "Pizza"),
                Arguments.of(true, "pizza"),
                Arguments.of(true, "PIZZA"),
                Arguments.of(true, "Pasta"),
                Arguments.of(true, "pasta"),
                Arguments.of(true, "PASTA"),
                Arguments.of(false, "Soup"),
                Arguments.of(false, ""),
                Arguments.of(false, "123")
        );
    }
}