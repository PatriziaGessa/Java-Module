package academy.boostprogramme.java.week8.set2.exercise1;

import java.util.Objects;

public class Safe {

    private String securityLevel;
    private int difficultPoints;

    public Safe(String securityLevel, int difficultPoints) {
        this.securityLevel = securityLevel;
        this.difficultPoints = difficultPoints;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public int getDifficultPoints() {
        return difficultPoints;
    }

    public void setDifficultPoints(int difficultPoints) {
        this.difficultPoints = difficultPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Safe safe = (Safe) o;
        return difficultPoints == safe.difficultPoints &&
                Objects.equals(securityLevel, safe.securityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityLevel, difficultPoints);
    }
}
