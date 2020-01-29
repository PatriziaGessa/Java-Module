package academy.boostprogramme.java.week1.set1;

public class Division {
    public static double divide(double numbOne, double numbTwo) {
        double quotient = numbOne / numbTwo;
        return quotient;
    }

    public static void main(String[] args) {
        double quotient = divide (84, 8);

        System.out.println("The quotient is " + quotient);


    }
}
