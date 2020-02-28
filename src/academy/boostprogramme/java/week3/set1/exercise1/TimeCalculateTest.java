package academy.boostprogramme.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalculateTest {

    TimeCalculate timeCalculate = new TimeCalculate();

    @Test
    void calculateWalkingTime() {
        double distance = 0.3;

        double result = timeCalculate.calculateWalkingTime(distance);

        Assertions.assertEquals(4.5, result);
    }

    @Test
    void calculateTramTime() {
    }

    @Test
    void calculateTotalTime() {
    }
}