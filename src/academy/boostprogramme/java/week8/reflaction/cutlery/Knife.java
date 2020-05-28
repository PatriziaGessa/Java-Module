package academy.boostprogramme.java.week8.reflaction.cutlery;

public class Knife implements Cutlery {

    @Override
    public String getName() {
        return "Knife";
    }

    @Override
    public boolean isUsedFor(String dish) {
        return dish.equalsIgnoreCase("Fish")|| dish.equalsIgnoreCase("Pizza");
    }
}
