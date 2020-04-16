package academy.boostprogramme.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {

    VowelCounter counter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "0, ''",
            "0, jkwxy",
            "0, 123b456c",
            "1, a",
            "2, alpha",
            "5, uoiea",
            "6, orthomixovirus",

    })
    void count(int expected, String word) {

        int result = counter.count(word);

        Assertions.assertEquals(expected,result);
    }
}