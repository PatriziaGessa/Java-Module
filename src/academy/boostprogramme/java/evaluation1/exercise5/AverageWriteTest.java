package academy.boostprogramme.java.evaluation1.exercise5;

import academy.boostprogramme.java.evaluation1.olderClasses.FileReader;
import academy.boostprogramme.java.evaluation1.olderClasses.FileWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ClientInfoStatus;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageWriteTest {

    AverageWrite averageWrite = new AverageWrite();

    FileReader reader = new FileReader();


    private String input = "src/academy/boostprogramme/java/evaluation1/files/numbers.txt";
    private String output = "src/academy/boostprogramme/java/evaluation1/files/averages.txt";
    private String expectedFile = "src/academy/boostprogramme/java/evaluation1/files/averages_expected.txt";

    @Test
    void write() {
        averageWrite.write(input,output);
        averageWrite.write(input, output);

        List<String> expected = reader.read(expectedFile);
        List<String> result = reader.read(output);

        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void deleteFileAverages() {
        Path path = Path.of(output);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}