package academy.boostprogramme.java.week8.set2.exercise1;

public class ThiefAttemptCounter {

    public int countAttempts(Thief thief, Safe safe) {
        int counter = 0;
        while(safe.getDifficultPoints() > 0) {
            thief.open(safe);
            counter ++;
        }
        return counter;
    }
}
