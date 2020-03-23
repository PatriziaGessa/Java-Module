package academy.boostprogramme.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListSecondHalfPicker {

    public String pick (List<String> strings) {

        Random random = new Random();
        int size = strings.size();
        int half = size / 2;
        int lastHalfPart = size - half;
        int randomIndex = random.nextInt(lastHalfPart) + half;
        return  strings.get(randomIndex);
    }
}
