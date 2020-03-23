package academy.boostprogramme.java.week4.set2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {

    public double calculate(List<Double> doubles) {
        List<Double> sortNumbs = new ArrayList<>(doubles);
        Collections.sort(sortNumbs);

        int size = sortNumbs.size();
        int halfSize = size / 2;

        if(size == 0) {
            return 0.0;
        }

        if(size % 2 ==0){
            return (sortNumbs.get(halfSize) + sortNumbs.get(halfSize-1)) /2;
        }

        return sortNumbs.get(halfSize);

    }


}
