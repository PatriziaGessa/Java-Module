package academy.boostprogramme.java.week1.set1;

public class Sum{
    public static int sumInt(int numbOne, int numbTwo) {
        return numbOne + numbTwo;
    }
    public static double sumDouble(double numbOne, double numbTwo) {
        return numbOne + numbTwo;
    }
    public static void main(String[] args) {
        int sumInt = sumInt(21, 21);
        double sumDouble = sumDouble(6.1, 6.1);

        System.out.println("The int sum is " + sumInt);
        System.out.println("The double sum is " + sumDouble);

    }
}


