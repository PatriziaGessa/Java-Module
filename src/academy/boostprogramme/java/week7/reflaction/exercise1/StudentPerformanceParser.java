package academy.boostprogramme.java.week7.reflaction.exercise1;

import java.util.List;


public class StudentPerformanceParser {

    private int elementsPerLine = 4;
    private int gender = 0;
    private int parentEducation = 1;
    private int mathScore = 2;
    private int readingScore = 3;
    private int writingScore = 4;



    public StudentPerformance parseLine(String line) {
        List<String> split = List.of(line.split(";", -1));

        return parseValues(
                split.get(gender),
                split.get(parentEducation),
                split.get(mathScore),
                split.get(readingScore),
                split.get(writingScore));

    }

    private StudentPerformance parseValues(String gender,String parentEducation, String mathScoreString, String readingScoreString, String writingScoreString) {

            int mathScore = getString(mathScoreString);
            int readingScore = getString(readingScoreString);
            int writingScore = getString(writingScoreString);
            return new StudentPerformance(gender, parentEducation, mathScore, readingScore,writingScore);
    }

    private int getString(String string) {
        return Integer.parseInt(string);
    }
}
