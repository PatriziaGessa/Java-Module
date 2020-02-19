package academy.boostprogramme.java.week2.set2.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HikerGatherer {

    public List<Hiker> gather() {
        Scanner scanner = new Scanner(System.in);

        List<Hiker> hikers = new ArrayList<>();

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        while (!name.equals("")) {
            System.out.println("What is your telephone number?");
            String telephoneNumber = scanner.nextLine();


            Hiker nextHiker = new Hiker(name, telephoneNumber);
            hikers.add(nextHiker);

            System.out.println("What is your name?");
            name = scanner.nextLine();
        }
        return hikers;
    }
}
