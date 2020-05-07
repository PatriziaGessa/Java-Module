package academy.boostprogramme.java.week7.reflaction.exercise1;

import academy.boostprogramme.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentPerformanceReader {

    private String contentRootPath = "src/academy/boostprogramme/java/week7/reflaction/exercise1/file/students-performance.csv";
    private StudentPerformanceParser studentPerformanceParser = new StudentPerformanceParser();
    private StreamFileReader streamFileReader = new StreamFileReader();

    public List<StudentPerformance> read() {
        return streamFileReader.readLines(contentRootPath)
                    .skip(1)
                    .map(studentPerformanceParser::parseLine)
                    .collect(Collectors.toList());

    }
}
