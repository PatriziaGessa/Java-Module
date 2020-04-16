package academy.boostprogramme.java.evaluation1.exercise4;

import academy.boostprogramme.java.evaluation1.olderClasses.FileReader;
import academy.boostprogramme.java.evaluation1.olderClasses.FileWriter;

import java.util.Collections;
import java.util.List;

public class FileContentReverser {

    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();

    public void reverse(String inputFile, String outputFile) {
        List<String> lines = reader.read(inputFile);
        Collections.reverse(lines);
        writer.write(outputFile,lines);
    }

}
