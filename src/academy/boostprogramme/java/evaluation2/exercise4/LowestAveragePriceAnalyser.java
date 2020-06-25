package academy.boostprogramme.java.evaluation2.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.*;
import static java.util.Optional.*;

public class LowestAveragePriceAnalyser implements AvocadoAnalyser {

    @Override
    public String analyser(List<AvocadoEntry> entries) {
        Optional<AvocadoEntry> oResult = entries.stream()
                .sorted(comparing(AvocadoEntry::getAveragePrice))
                .findFirst();
        return getString(oResult);

    }

    private String getString(Optional<AvocadoEntry> oResult) {
        if(oResult.isEmpty()) {
            return "Lowest average price is: Result not found";

        } AvocadoEntry result = oResult.get();
        return "Lowest average price is: " + result.getAveragePrice() + " on " + result.getYear();
    }
}

