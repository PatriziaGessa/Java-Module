package academy.boostprogramme.java.evaluation2.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NumberNameFinder {

    public Optional<String> find(List<String> textNumbers) {
        return textNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .findFirst();
    }
}
