package academy.boostprogramme.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AddLegTest {

    BuilderStep step = new AddLeg();


    @Test
    void applyOne() {
        Furniture furniture = new Furniture("Text");
        step.apply(furniture);

        Furniture expected = new Furniture("Text");
        expected.getParts().add("Leg");
        Assertions.assertEquals(expected, furniture);
    }

    @Test
    void applyTwice() {
        Furniture furniture = new Furniture("Text");
        step.apply(furniture);
        step.apply(furniture);

        Furniture expected = new Furniture("Text");
        expected.getParts().add("Leg");
        expected.getParts().add("Leg");

        Assertions.assertEquals(expected, furniture);
    }
}