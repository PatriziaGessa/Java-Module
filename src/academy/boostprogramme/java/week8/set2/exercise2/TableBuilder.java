package academy.boostprogramme.java.week8.set2.exercise2;

import java.util.List;

public class TableBuilder {

    private List<BuilderStep> steps = List.of(
            new AddLeg(),
            new AddLeg(),
            new AddLeg(),
            new AddLeg(),
            new AddSurface());

    public Furniture build() {
        Furniture table = new Furniture("Table");
        steps.stream()
                .forEach(steps -> steps.apply(table));
        return table;
    }
}
