package academy.boostprogramme.java.week4.reflaction.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxOrMinPickerTest {

    MaxOrMinPicker maxOrMinPicker = new MaxOrMinPicker();

    @Test
    void pickReturnsRandomNumberForEmptyEntries() {

        List<Integer> input = List.of(2,5,7,10);

        int result = maxOrMinPicker.pick(input);
        Assertions.assertTrue(input.contains(result));

    }
}