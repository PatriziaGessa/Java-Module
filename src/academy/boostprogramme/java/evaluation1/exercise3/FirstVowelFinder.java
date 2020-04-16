package academy.boostprogramme.java.evaluation1.exercise3;

import java.util.List;
import java.util.Optional;

public class FirstVowelFinder {

    private final List<String> vowels = List.of("a","e","i","o","u");

    public Optional<String> find(String word) {
        List<String> characters = getSplit(word);
        for(String character : characters) {
            if(vowels.contains(character)) {
                return Optional.of(character);
            }
        }
        return Optional.empty();

    }


    private List<String> getSplit(String string) {
        return List.of(string.split(""));
    }
}
