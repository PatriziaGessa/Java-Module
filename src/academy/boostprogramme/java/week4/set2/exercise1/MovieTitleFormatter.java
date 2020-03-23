package academy.boostprogramme.java.week4.set2.exercise1;
import java.util.List;


public class MovieTitleFormatter {

    public String format(String title) {

        StringCapitalize stringCapitalize = new StringCapitalize();

        List<String> words = List.of(title.split(" "));
        String evertFirstLetterAsCapitalLetter = "";
        for(String word : words) {
            String capitalized = stringCapitalize.capitalize(word);
            evertFirstLetterAsCapitalLetter = evertFirstLetterAsCapitalLetter + capitalized + " ";
        }
        return evertFirstLetterAsCapitalLetter.trim();

}}
