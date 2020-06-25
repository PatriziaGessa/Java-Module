package academy.boostprogramme.java.evaluation2.exercise4;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Analyser {

    private List<AvocadoAnalyser> analysers = List.of(
            new LowestAveragePriceAnalyser(),
            new RegionOfMostSoldOrganicAnalyser()
    );

    public List<String> analyse(List<AvocadoEntry> entries) {
        return analysers.stream()
                .map(avocadoAnalyser -> avocadoAnalyser.analyser(entries))
                .collect(toList());
    }
}
