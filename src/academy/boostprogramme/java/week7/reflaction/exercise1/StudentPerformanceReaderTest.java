package academy.boostprogramme.java.week7.reflaction.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentPerformanceReaderTest {

    StudentPerformanceReader reader = new StudentPerformanceReader();

    @Test
    void test() {
        List<StudentPerformance> result = reader.read();


        int expectedSize = 1000;
        Assertions.assertEquals(expectedSize,result.size());
        StudentPerformance expectedFirst = new StudentPerformance(
                "female",
                "bachelor's degree",
                72,
                72,
                74);

        StudentPerformance resultFirst = result.get(0);
        assertPerformanceEquals(expectedFirst,resultFirst);

        StudentPerformance expectedLast = new StudentPerformance(
                "female",
                "some college",
                77,
                86,
                86);

        StudentPerformance resultLast = result.get(result.size()-1);
        assertPerformanceEquals(expectedLast,resultLast);

    }

    private void assertPerformanceEquals(StudentPerformance expected, StudentPerformance result) {
        assertEquals(expected.getGender(),result.getGender());
        assertEquals(expected.getParentEducation(), result.getParentEducation());
        assertEquals(expected.getMathScore(), result.getMathScore());
        assertEquals(expected.getReadingScore(), result.getReadingScore());
        assertEquals(expected.getWritingScore(), result.getWritingScore());
    }


}