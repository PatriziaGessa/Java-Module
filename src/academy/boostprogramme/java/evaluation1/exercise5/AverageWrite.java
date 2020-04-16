package academy.boostprogramme.java.evaluation1.exercise5;

import academy.boostprogramme.java.evaluation1.olderClasses.FileReader;
import academy.boostprogramme.java.evaluation1.olderClasses.FileWriter;

import java.util.ArrayList;
import java.util.List;

public class AverageWrite {

    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();


    public void write(String input, String output) {
        List<String> averageLines = new ArrayList<>();
        List<String> lines = reader.read(input);

        for (String line : lines) {
            List<Integer> numbers = getSplit(line);
            double average = getAverage(numbers);
            String averageString = getDoubleConvert(average);
            averageLines.add(averageString);
        }
        writer.write(output, averageLines);
    }




    double getAverage(List<Integer> numbers) {
        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        return average / numbers.size();

    }

    private Integer getStringConvert(String string) {
        return Integer.parseInt(string);

    }

    private List<Integer> getSplit(String stringOfNumbers) {
        List<String> listOfNumbers = List.of(stringOfNumbers.split(" "));
        List<Integer> numbers = new ArrayList<>();
        for (String string : listOfNumbers) {
            int number = getStringConvert(string);
            numbers.add(number);

        }
        return numbers;
    }

    private String getDoubleConvert(double number) {
        return String.valueOf(number);
    }


}
