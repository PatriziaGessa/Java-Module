package academy.boostprogramme.java.week8.set2.exercise1;

public class BeginnerThief implements Thief {

    private final int skillLevel = 1;

    @Override
    public void open(Safe safe) {
        int pointsBefore = safe.getDifficultPoints();
        int pointsAfter = pointsBefore - skillLevel;
        safe.setDifficultPoints(pointsAfter);
    }
}
