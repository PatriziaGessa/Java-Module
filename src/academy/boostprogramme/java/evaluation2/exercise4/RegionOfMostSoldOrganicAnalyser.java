package academy.boostprogramme.java.evaluation2.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static java.util.Comparator.*;

public class RegionOfMostSoldOrganicAnalyser implements AvocadoAnalyser {

    @Override
    public String analyser(List<AvocadoEntry> entries) {
       Optional<AvocadoEntry> oResult = entries.stream()
               .filter(excludeTotalUS())
               .filter(findTheRegionsWithOrganicAvocado())
               .sorted(comparing(AvocadoEntry::getTotalSold).reversed())
               .findFirst();
        return getString(oResult);
    }

    private Predicate<AvocadoEntry> findTheRegionsWithOrganicAvocado() {
        return entry -> entry.getType().equals("organic");
    }

    private Predicate<AvocadoEntry> excludeTotalUS() {
        return entry -> !entry.getRegion().equals("TotalUS");
    }

    private String getString(Optional<AvocadoEntry> oResult) {
        if(oResult.isEmpty()) {
            return "Region of most sold organic is: Result not found";

        } AvocadoEntry result = oResult.get();
        return "Region of most sold organic is: " + result.getRegion() + " with " + result.getTotalSold();
    }
}
