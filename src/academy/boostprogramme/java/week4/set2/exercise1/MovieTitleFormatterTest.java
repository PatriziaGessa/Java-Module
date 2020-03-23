package academy.boostprogramme.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MovieTitleFormatterTest {

    MovieTitleFormatter movieTitleFormatter = new MovieTitleFormatter();

    @ParameterizedTest
    @CsvSource({

            "A Beautiful Mind, a beautiful mind",
            "Life Is Beautiful, Life is beautiful",
            "'' , ''",
            "20000 Leagues Under The Sea, 20000 leagues under the sea",
    })
    void format(String expected, String title) {

        String result = movieTitleFormatter.format(title);

        Assertions.assertEquals(expected, result);
    }
}