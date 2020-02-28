package academy.boostprogramme.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalculateTest {

    TimeCalculate timeCalculate = new TimeCalculate();

    @Test
    void calculateWalkingTime() {
        double distance = 1.5;

        double result = timeCalculate.calculateWalkingTime(distance);

        double expected = 22.5;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateTramTime() {
        double numbOfStation = 2;

        double result = timeCalculate.calculateTramTime(numbOfStation);

        double expected = 8;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateTotalTime() {
        double distance = 1.5;
        double numbOfStation = 2;
        double distanceToFriendsHouse= 0.20;


        double result = timeCalculate.calculateTotalTime(numbOfStation,distance,distanceToFriendsHouse);

        double expected = 33.5;
        Assertions.assertEquals(expected,result);
    }
}