package academy.boostprogramme.java.week8.set2.exercise1;

public class AdvanceThief implements  Thief {

    private final  int skillLevel = 2;

    @Override
    public void open(Safe safe) {
        int before = safe.getDifficultPoints();
        int after = before - skillLevel;
        safe.setDifficultPoints(after);
    }
}
