package academy.boostprogramme.java.week2.set1.exercise3;

import java.util.List;

public class Recipe {
    private String name;
    private int numbOfMinutes;
    private List<String> ingredients;
    private List<String> steps;

    public Recipe (String name, int numbOfMinutes, List<String> ingredients, List<String> steps) {
        this.name = name;
        this.numbOfMinutes = numbOfMinutes;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public  int getNumbOfMinutes() {
        return numbOfMinutes;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }


}
