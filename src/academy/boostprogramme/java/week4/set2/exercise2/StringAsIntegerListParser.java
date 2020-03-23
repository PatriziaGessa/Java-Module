package academy.boostprogramme.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListParser {

    public List<Integer> parse (String input) {
        if(input.isEmpty()) {
            return List.of();
        }

        List<Integer> integers = new ArrayList<>();
        List<String> strings = List.of(input.split(";"));
        for(String string : strings) {
            int integer = Integer.parseInt(string);
            integers.add(integer);
        }
        return integers;

    }
}
