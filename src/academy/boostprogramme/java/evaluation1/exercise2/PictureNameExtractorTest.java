package academy.boostprogramme.java.evaluation1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PictureNameExtractorTest {

    PictureNameExtractor extractor = new PictureNameExtractor();

    @ParameterizedTest
    @CsvSource({
            "'', 01222013Pic.jpg",
            "sunshine, 01222013SunshinePic.jpg",
            "snowflake, 24122019SnowflakePic.jpg",
            "dereks birthday, 01082003Dereks-BirthdayPic.jpg"

    })
    void extract(String expected, String filename) {
        String result = extractor.extract(filename);

        Assertions.assertEquals(expected, result);
    }
}