package academy.boostprogramme.java.week8.reflaction.cutlery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {

    Cutlery knife = new Knife();

    @Test
    void getName() {
        Assertions.assertEquals("Knife", knife.getName());
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void isUsedFor(boolean expected, String dish) {
        boolean result = knife.isUsedFor(dish);
        Assertions.assertEquals(expected,result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(true, "Fish"),
                Arguments.of(true, "fish"),
                Arguments.of(true, "FISH"),
                Arguments.of(true, "Pizza"),
                Arguments.of(true, "pizza"),
                Arguments.of(true, "PIZZA"),
                Arguments.of(false, "Pasta"),
                Arguments.of(false, ""),
                Arguments.of(false, "&1 $")
        );
    }
}