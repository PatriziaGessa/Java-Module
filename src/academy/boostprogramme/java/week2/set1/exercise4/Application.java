package academy.boostprogramme.java.week2.set1.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private static void explain (Menu menu) {
        System.out.println("These are the available dishes on the menu: ");

        for(Dish dish : menu.getDishes()) {
            System.out.println(dish.getName() + " for " + dish.getPrice() + " Euro");
        }
    }

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();

        Dish lasagna = new Dish ("Lasagna", 7.6);
        dishes.add(lasagna);
        Dish caesarSalad = new Dish("Caesar Salad" , 5.8);
        dishes.add(caesarSalad);
        Dish fishAndChips = new Dish("Fish & Chips", 3.9);
        dishes.add(fishAndChips);

        Menu menu = new Menu("Da Patrizia", dishes);

        explain(menu);

    }

}
