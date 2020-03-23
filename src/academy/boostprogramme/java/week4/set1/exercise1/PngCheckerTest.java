package academy.boostprogramme.java.week4.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PngCheckerTest {

    PngChecker pngChecker = new PngChecker();

    @ParameterizedTest
    @CsvSource({
            "false, .pn",
            "false, word,png",
            "false, png.",
            "false, ''",
            "true, .PnG",
            "true, word.PNG",
            "true, word.png",


    })
    void check(boolean expected, String file) {

        boolean result = pngChecker.check(file);

        Assertions.assertEquals(expected, result);
    }
}