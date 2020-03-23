package academy.boostprogramme.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringAsIntegerListParserTest {

    StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();

    @Test
    void parseReturnsEmptyListForEmptyString() {
        String input = "";

        List<Integer> result = stringAsIntegerListParser.parse(input);

        Assertions.assertEquals(0, result.size());
    }

    @Test
    void parseReturnsASingleElementInTheListForSingleStringLikeInput() {
        String input = "1";

        List<Integer> result = stringAsIntegerListParser.parse(input);

        List<Integer> expected = List.of(1);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void parseReturnsMultipleElementsInTheListForMultipleEntries() {
        String input = "1;2;3;11;22;33;0;0;7";

        List<Integer> result = stringAsIntegerListParser.parse(input);

        List<Integer> expected = List.of(1,2,3,11,22,33,0,0,7);
        Assertions.assertEquals(expected,result);
    }
}