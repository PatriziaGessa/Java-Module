package academy.boostprogramme.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddSurfaceTest {

    BuilderStep step = new AddSurface();
    private final String surface = "Surface";

    @Test
    void applyOnce() {
        Furniture furniture = new Furniture("Text");
        step.apply(furniture);

        Furniture expected = new Furniture("Text");
        expected.getParts().add(surface);
        Assertions.assertEquals(expected, furniture);
    }

    @Test
    void applyTwice() {
        Furniture furniture = new Furniture("Text");
        step.apply(furniture);
        step.apply(furniture);

        Furniture expected = new Furniture("Text");
        expected.getParts().add(surface);
        expected.getParts().add(surface);

        Assertions.assertEquals(expected, furniture);
    }
}