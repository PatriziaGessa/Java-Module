package academy.boostprogramme.java.week4.set2.exercise4;

import academy.boostprogramme.java.week4.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {

    private DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();

    public List<Double>  calculate (List<Double> doubles){

        List<Double> newValues = new ArrayList<>();
        double median = doubleListMedianCalculator.calculate(doubles);

        for (double numb : doubles) {
            double value =  numb - median;
            newValues.add(value);
        }

        return newValues;
    }
}
