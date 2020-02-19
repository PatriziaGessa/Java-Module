package academy.boostprogramme.java.week2.set2.exercise4;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        StepCollector collector = new StepCollector();
        AverageCalculator averageCalculator = new AverageCalculator();
        DistanceCalculator distance = new DistanceCalculator();

        List<Integer> numbsOfSteps = collector.collector();

        double averageNumbsOfSteps = averageCalculator.calculateAverage(numbsOfSteps);
        double averageTotalDistance = distance.calculateDistanceInKilometers(averageNumbsOfSteps);

        System.out.println("They made " + averageNumbsOfSteps + " steps on average and they walked. " );
        System.out.println("They made " + averageTotalDistance + " km on average.");



    }

}
