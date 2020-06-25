package academy.boostprogramme.java.evaluation2.exercise3;

import java.util.Objects;

public class Spaceship {

    private int healthPoint;
    private int damage;

    public Spaceship(int healthPoint, int damage) {
        this.healthPoint = healthPoint;
        this.damage = damage;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spaceship spaceship = (Spaceship) o;
        return healthPoint == spaceship.healthPoint &&
                damage == spaceship.damage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthPoint, damage);
    }
}
