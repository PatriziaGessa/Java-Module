package academy.boostprogramme.java.week4.reflaction.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxOrMinPicker {

    public int pick(List<Integer> numbers) {
        Random random = new Random();

        if(numbers.isEmpty()) {
            return random.nextInt();
        }

        List<Integer> sortedNumbers =  new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        int size = sortedNumbers.size();
        int small = sortedNumbers.get(0);
        int bigger= sortedNumbers.get(size-1);

        List<Integer> numbs = List.of(small, bigger);
        int sizeSecondList = numbs.size();
        int randomIndex = random.nextInt(sizeSecondList);


        return numbs.get(randomIndex);
    }

}
