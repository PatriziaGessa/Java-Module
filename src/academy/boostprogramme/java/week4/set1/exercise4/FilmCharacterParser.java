package academy.boostprogramme.java.week4.set1.exercise4;


import java.util.List;

public class FilmCharacterParser {

    public static FilmCharacter parse (String string) {

        List<String> strings = List.of(string.split(";"));
        String firstName = strings.get(0);
        String secondName= strings.get(1);

        FilmCharacter filmCharacter = new FilmCharacter(firstName,secondName);

        return filmCharacter;
    }
}
