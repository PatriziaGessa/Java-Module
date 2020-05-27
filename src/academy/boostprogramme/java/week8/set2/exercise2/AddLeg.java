package academy.boostprogramme.java.week8.set2.exercise2;

public class AddLeg implements  BuilderStep {

    private String leg = "Leg";
    @Override
    public void apply(Furniture furniture) {
        furniture.getParts().add(leg);
    }
}
