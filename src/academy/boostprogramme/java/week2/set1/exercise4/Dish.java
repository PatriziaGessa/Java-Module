package academy.boostprogramme.java.week2.set1.exercise4;

import javax.xml.namespace.QName;

public class Dish {
    private String name;
    private double price;

    public Dish(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

}
