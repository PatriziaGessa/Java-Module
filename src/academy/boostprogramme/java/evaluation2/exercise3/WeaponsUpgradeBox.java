package academy.boostprogramme.java.evaluation2.exercise3;

public class WeaponsUpgradeBox extends MysteryBox {

    public WeaponsUpgradeBox(int intensity) {
        super(intensity);
    }

    @Override
    public void apply(Spaceship spaceship) {
        int intensity = getIntensity();
        int damage = spaceship.getDamage();
        spaceship.setDamage(intensity + damage);
    }
}
