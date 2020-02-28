package academy.boostprogramme.java.week3.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RenameTest {

    Rename renameTest = new Rename();

    @Test
    void generateNewName() {

        String text = "photo.jpg";

        String result = renameTest.generateNewName(text);

        String expected = "photo.png";
        Assertions.assertEquals(expected,result);

    }
}