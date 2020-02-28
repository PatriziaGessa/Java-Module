package academy.boostprogramme.java.week3.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheLastBeFirstTest {

    TheLastBeFirst theLastBeFirst = new TheLastBeFirst();

    @Test
    void reverse() {

        List<Integer> numbers = List.of(5,4,3,2,1);

        List<Integer> result = theLastBeFirst.reverse(numbers);

        List<Integer> expected = List.of(1,2,3,4,5);
        Assertions.assertEquals(expected,result);
    }
}