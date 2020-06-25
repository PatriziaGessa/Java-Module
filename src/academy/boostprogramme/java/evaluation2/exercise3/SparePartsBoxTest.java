package academy.boostprogramme.java.evaluation2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparePartsBoxTest {

    MysteryBox sparePartsBox = new SparePartsBox(2);

    @Test
    void apply() {
        Spaceship spaceship = new Spaceship(2, 3);

        sparePartsBox.apply(spaceship);

        int expected = 4;
        assertEquals(expected, spaceship.getHealthPoint());
    }

    @Test
    void getIntensity() {
        int expected = 2;
        assertEquals(expected, sparePartsBox.getIntensity());
    }
}