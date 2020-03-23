package academy.boostprogramme.java.week4.set2.exercise1;

import java.util.List;

public class StringCapitalize {

    public String capitalize (String string) {
        if(string == "") {
            return string;
        }

        int length = string.length();
        List<String> letters = List.of(string.split(""));
        String firstPart = letters.get(0);
        firstPart = firstPart.toUpperCase();
        String restOfText = string.substring(1, length);

        return firstPart + restOfText;
    }
}
