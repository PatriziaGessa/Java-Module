package academy.boostprogramme.java.week1.set1.reflaction.exerciseA;
import java.util.Scanner;

public class firstToThePowerOfTheSecond {

    public static int raiseToPower (int base, int exponent) {
        int result = base;

        for(int i = 1; i < exponent; i++) {
            result = result * base;
            }
            return result;
        }

        public static void main(String[] args) {
            int product = raiseToPower(2, 5);
            System.out.println("The product is: " + product);
        }

}
