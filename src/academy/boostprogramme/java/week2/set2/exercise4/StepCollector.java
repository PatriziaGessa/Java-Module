package academy.boostprogramme.java.week2.set2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepCollector {

    public List<Integer> collector() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersOfSteps = new ArrayList<>();
        List<String> names = List.of("Matilda","Hansel","Derek");

        for(String name : names) {
            System.out.println(name + " How many steps did you do?");
            int numbsOfSteps = scanner.nextInt();

            numbersOfSteps.add(numbsOfSteps);
        }
        return numbersOfSteps;
    }


}
