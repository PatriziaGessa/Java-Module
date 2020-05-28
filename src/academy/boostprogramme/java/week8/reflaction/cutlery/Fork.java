package academy.boostprogramme.java.week8.reflaction.cutlery;

public class Fork implements Cutlery {

    @Override
    public String getName() {
        return "Fork";
    }

    @Override
    public boolean isUsedFor(String dish) {
        return dish.equalsIgnoreCase("Fish") || dish.equalsIgnoreCase("Pizza")|| dish.equalsIgnoreCase("Pasta");
    }
}
