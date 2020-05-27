package academy.boostprogramme.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThiefAttemptCounterTest {

    ThiefAttemptCounter counter = new ThiefAttemptCounter();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(8, new AdvanceThief()),
                Arguments.of(16, new BeginnerThief())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void countAttempts(int expected, Thief thief) {
        Safe safe = new Safe("Level", 16);

        int result = counter.countAttempts(thief,safe);
        assertEquals(expected, result);
    }
}