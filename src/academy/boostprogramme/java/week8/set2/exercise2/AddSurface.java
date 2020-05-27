package academy.boostprogramme.java.week8.set2.exercise2;

public class AddSurface implements BuilderStep {

    String  surface = "Surface";

    @Override
    public void apply(Furniture furniture) {
        furniture.getParts().add(surface);
    }
}
