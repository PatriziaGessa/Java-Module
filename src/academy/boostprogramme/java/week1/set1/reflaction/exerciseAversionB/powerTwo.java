package academy.boostprogramme.java.week1.set1.reflaction.exerciseAversionB;

import java.util.Scanner;

public class powerTwo {
    public static int raiseToPower (int base, int exponent) {
        int result = base;

        for(int i = 1; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the base: ");
        int base = scanner.nextInt();
        System.out.println("Give me the exponent (the power):");
        int exponent = scanner.nextInt();
        int numbProduct = raiseToPower(base, exponent);

        System.out.println("The product is: " + numbProduct);




    }
}

