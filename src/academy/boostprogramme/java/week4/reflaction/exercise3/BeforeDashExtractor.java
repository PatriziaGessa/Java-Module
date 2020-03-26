package academy.boostprogramme.java.week4.reflaction.exercise3;

import java.util.List;

public class BeforeDashExtractor {

    public String extract(String string) {

        if(!string.contains("-")) {
            return "";
        }

        List<String> characters = List.of(string.split("-"));
        return characters.get(0);
    }


}
