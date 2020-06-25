package academy.boostprogramme.java.evaluation2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponsUpgradeBoxTest {

    MysteryBox weaponsUpgradeBox = new WeaponsUpgradeBox(2);

    @Test
    void apply() {
        Spaceship spaceship = new Spaceship(2, 3);
        weaponsUpgradeBox.apply(spaceship);

        int expected = 5;
        assertEquals(expected, spaceship.getDamage());
    }
    @Test
    void getIntensity() {
        int expected = 2;
        assertEquals(expected, weaponsUpgradeBox.getIntensity());
    }
}