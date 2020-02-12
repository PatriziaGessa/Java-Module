package academy.boostprogramme.java.week2.set1.exercise2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("What is the color of the car?");
        String color = scanner.nextLine();

        System.out.println("What year was the car built?");
        int yearBuilt = scanner.nextInt();

        Car car = new Car (color, yearBuilt);
    }
}
