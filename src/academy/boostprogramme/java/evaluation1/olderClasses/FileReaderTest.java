package academy.boostprogramme.java.evaluation1.olderClasses;

import academy.boostprogramme.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FileReaderTest {

    academy.boostprogramme.java.week5.set2.exercise1.FileReader fileReader = new FileReader();

    String path = "src/academy/boostprogramme/java/week5/set2/file/document.txt";

    @Test
    void read() {
        List<String> result = fileReader.read(path);

        List<String> expected = Arrays.asList(
                "line 1;part 1-2",
                "line 2;part 2-2",
                "line 3;part 3-2");
        Assertions.assertEquals(expected, result);
    }
}