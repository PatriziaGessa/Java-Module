package academy.boostprogramme.java.week8.set2.exercise1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerThiefTest {

    BeginnerThief thief = new BeginnerThief();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, 3),
                Arguments.of(0, 1),
                Arguments.of(-1, 0)
        );
    }

    @ParameterizedTest
   @MethodSource("parameters")
    void open(int after, int before) {
        Safe safe = new Safe("Level", before);

        thief.open(safe);

        Safe expected = new Safe("Level", after);
        assertEquals(expected, safe);
    }
}