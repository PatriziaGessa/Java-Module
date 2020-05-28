package academy.boostprogramme.java.week8.reflaction.cutlery;

public class Spoon implements Cutlery {

    @Override
    public String getName() {
        return "spoon";
    }

    @Override
    public boolean isUsedFor(String dish) {
        return dish.equalsIgnoreCase("soup");
    }
}
