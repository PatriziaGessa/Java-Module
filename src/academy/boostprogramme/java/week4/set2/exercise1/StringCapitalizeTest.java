package academy.boostprogramme.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCapitalizeTest {

    StringCapitalize stringCapitalize = new StringCapitalize();

    @ParameterizedTest
    @CsvSource({

            "Test, Test",
            "'' , ''",
            "10, 10",
            "Hello3, hello3",
            "3ciao, 3ciao",
            "A, a",
            "Hei, hei",

    })
    void capitalize(String expected, String string) {

        String result = stringCapitalize.capitalize(string);

        Assertions.assertEquals(expected, result);
    }
}