package academy.boostprogramme.java.week5.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ClientInfoStatus;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    FileReader fileReader = new FileReader();

    String path = "src/academy/boostprogramme/java/week5/set2/file/document.txt";

    @Test
    void read() {
        List<String> result = fileReader.read(path);

        List<String> expected = List.of("line 1;part 1-2",
                "line 2;part 2-2",
                "line 3;part 3-2");
        Assertions.assertEquals(expected, result);
    }
}