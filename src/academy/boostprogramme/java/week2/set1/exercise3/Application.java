package academy.boostprogramme.java.week2.set1.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String name = "Spaghetti alla carbonara";
        int numbOfMinutes = 25;
        List<String> ingredients =List.of (
                "Spaghetti" ,
                "Egg yolks" ,
                "Salt" ,
                "Bacon" ,
                "Black pepper" ,
                "Pecorino");
        List<String> steps = List.of(
                "Boil water and salt in a pot" ,
                "Slice the bacon and put in a pan to brown" ,
                "Put the spaghetti in boiling water" ,
                "Put in a bowl the egg yolks with half of the pecorino cheese and some black pepper and mix with a kennel" ,
                "Drain the pasta AL DENTE directly into the pan with the bacon" ,
                // If you want the "creamier" sauce add a little cooking water.
                // Do not try to add those sauce/cream that you can buy at the supermarket.
                // Doing so is considered a crime and therefore punishable by law... My law!
                "Add the mixture of egg yolks, pecorino cheese and pepper to the pasta inside the pan" ,
                "Add the remaining pecorino cheese");


        Recipe spaghettiAllaCarbonara = new Recipe(name,numbOfMinutes,ingredients,steps);

    }
}
