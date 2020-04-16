package academy.boostprogramme.java.evaluation1.exercise4;

import academy.boostprogramme.java.evaluation1.olderClasses.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileContentReverserTest {

    FileContentReverser fileContentReverser = new FileContentReverser();

    FileReader reader = new FileReader();

    String input = "src/academy/boostprogramme/java/evaluation1/files/lines.txt";
    String output = "src/academy/boostprogramme/java/evaluation1/files/lines-reversed.txt";
    String expectedFile = "src/academy/boostprogramme/java/evaluation1/files/lines-reversed_expected.txt";

    @Test
    void reverse() {

        fileContentReverser.reverse(input, output);

        List<String> expected = reader.read(expectedFile);
        List<String> result = reader.read(output);

        Assertions.assertEquals(expected, result);


    }
}