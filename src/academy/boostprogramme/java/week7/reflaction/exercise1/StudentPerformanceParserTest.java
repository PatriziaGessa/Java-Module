package academy.boostprogramme.java.week7.reflaction.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentPerformanceParserTest {

    StudentPerformanceParser parser = new StudentPerformanceParser();

    @ParameterizedTest
    @CsvSource({
            "female, bachelor's degree, 72, 72, 74,female;bachelor's degree;72;72;74",
            "male, associate's degree, 47,57, 44,male;associate's degree;47;57;44",
    })

    void test( String gender, String parentEducation, int mathScore, int readingScore, int writingScore, String input) {

        StudentPerformance expected = new StudentPerformance( gender, parentEducation, mathScore, readingScore, writingScore);

        StudentPerformance result = parser.parseLine(input);
        Assertions.assertEquals(expected, result);

    }
}