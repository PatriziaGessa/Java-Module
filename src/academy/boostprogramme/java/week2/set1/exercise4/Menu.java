package academy.boostprogramme.java.week2.set1.exercise4;

import java.util.List;

public class Menu {
    private String restaurantName;
    private List<Dish> disches;

    public Menu (String restaurantName, List<Dish> dishes) {
        this.restaurantName = restaurantName;
        this.disches = dishes;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public List<Dish> getDisches() {
        return disches;
    }
}
