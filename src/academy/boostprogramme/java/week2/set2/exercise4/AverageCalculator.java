package academy.boostprogramme.java.week2.set2.exercise4;

import java.util.List;

public class AverageCalculator {

    public double calculateAverage(List<Integer> numbers) {
        double sum = 0D;
        int size = numbers.size();

        for(Integer number : numbers) {
            sum = sum + number;
        }

        return  sum / size;

    }
}
