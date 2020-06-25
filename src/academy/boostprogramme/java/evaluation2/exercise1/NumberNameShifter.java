package academy.boostprogramme.java.evaluation2.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class NumberNameShifter {

    private NumberNamesDictionary dictionary = new NumberNamesDictionary();

    public List<String> shift(List<String> textNumbers) {
        return textNumbers.stream()
                .map(numb-> dictionary.getNumber(numb))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(numb-> numb + 1)
                .map(numb-> dictionary.getName(numb))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(toList());
    }
}