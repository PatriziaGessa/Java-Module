package academy.boostprogramme.java.week1.set1.exercise4;

public class WateringMachine {
    public static void main(String[] args) {

        int numbPlantsInGarden = 3;
        int numbPlantsToBuy = 9;
        int numbTotalPlants = numbPlantsInGarden + numbPlantsToBuy;
        int numbWateringMachine = 1;
        int capacityWateringMachine = 4;

        int numberOfWateringMachineToBuy = (numbTotalPlants / capacityWateringMachine) - numbWateringMachine;

        int priceProMachine = 20;
        int discount = 20;
        int priceWithDiscount = (discount * priceProMachine) / 100;

        int finalCost = (discount - priceWithDiscount) * numberOfWateringMachineToBuy;

        System.out.println("The number of machine to buy is: " + numberOfWateringMachineToBuy);
        System.out.println("The saving is: " + priceWithDiscount + "€");
        System.out.println("The final cost is: " + finalCost + "€");

    }
}
