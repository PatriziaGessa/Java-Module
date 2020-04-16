package academy.boostprogramme.java.evaluation1.exercise3;

import java.util.List;

public class VowelCounter {

    private final List<String> vowels = List.of("a","e","i","o","u");

    public int count(String word) {
        int counter = 0;
        List<String> characters = getSplit(word);
        for(String character : characters) {
            if (vowels.contains(character)) {
                counter++;
            }
        }
        return counter;

    }


    private List<String> getSplit(String string) {
        return List.of(string.split(""));
    }
}
