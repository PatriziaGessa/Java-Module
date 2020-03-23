package academy.boostprogramme.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListHalfPicker {

    public String pick (List<String> strings) {
        if(strings.size() == 1) {
            return strings.get(0);
        }

        Random random = new Random();

        int size = strings.size();
        int half = size / 2;
        int randomIndex = random.nextInt(half);
        return strings.get(randomIndex);
    }
}
