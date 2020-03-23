package academy.boostprogramme.java.week4.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FilmCharacterParserTest {

    FilmCharacterParser filmCharacterParser = new FilmCharacterParser();

    @ParameterizedTest
    @CsvSource({

            "Anakin, Skywalker, Anakin;Skywalker",
            "Frodo, Baggins, Frodo;Baggins",
            "Spongebob, Squarepants, Spongebob;Squarepants",
    })
    void parse(String expectedFirstName, String expectedSecondName, String string) {

        FilmCharacter result = filmCharacterParser.parse(string);

        Assertions.assertEquals(expectedFirstName, result.getFirstName());
        Assertions.assertEquals(expectedSecondName, result.getSecondName());

    }
}