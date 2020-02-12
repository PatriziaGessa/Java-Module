package academy.boostprogramme.java.week2.set1.exercise4;

import java.util.*;

public class Application {
    public static void explain(Menu menu) {
        System.out.println("There are the available dishes on the menu :");

        for (Dish dish : menu.getDisches()) {
            System.out.println(dish.getName() + " for" + dish.getPrice() + " Euro");

        }
    }


    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();

        Dish lasagna = new Dish("Lasagna", 7.6);
        Dish caesarSalad = new Dish("Caesar Salad", 5.8);
        Dish fishAndChips = new Dish("Fish & Chips", 3.9);

        Menu menu = new Menu("Da Patrizia", dishes);

        explain(menu);

    }
}