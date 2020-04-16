package academy.boostprogramme.java.evaluation1.exercise3;

import Prova.Test.Esercizio3.FirstByAgeFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FirstVowelFinderTest {

    FirstVowelFinder finder = new FirstVowelFinder();

    @ParameterizedTest
    @CsvSource({
            "''",
            "gssprz",
            "symphysy",

    })
    void findReturnsEmptyOptional(String word) {
        Optional<String> oResult = finder.find(word);

        Assertions.assertFalse(oResult.isPresent());
    }

    @ParameterizedTest
    @CsvSource({
            "a, a1l2p3h4a",
            "e, b.e.t.a",
            "a, g!a!m!m!a",
            "e, d/e/l/t/a",
    })
    void findReturnsStringVowelOptional(String expected, String word) {
        Optional<String> oResult = finder.find(word);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected,oResult.get());
    }
}