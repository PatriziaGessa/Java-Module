package academy.boostprogramme.java.evaluation2.exercise3;

public class SparePartsBox extends MysteryBox {

    public SparePartsBox(int intensity) {
        super(intensity);
    }

    @Override
    public void apply(Spaceship spaceship) {
        int intensity = getIntensity();
        int healthPoints = spaceship.getHealthPoint();
        spaceship.setHealthPoint(intensity + healthPoints );
    }
}
