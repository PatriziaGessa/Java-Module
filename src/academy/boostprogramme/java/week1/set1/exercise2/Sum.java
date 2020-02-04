package academy.boostprogramme.java.week1.set1.exercise2;

public class Sum {
    public static int sumInt (int numbOne, int numbTwo) {
        return numbOne + numbTwo;
    }

    public static double sumDouble (double numbOne, double numbTwo) {
        return numbOne + numbTwo;
    }

    public static void main(String[] args) {
        int totalSumInt = sumInt(21, 21);
        double totalSumDouble = sumDouble(6.1D, 6.1D);

        System.out.println("The total int sum is: " + totalSumInt);
        System.out.println("The total double sum is: " + totalSumDouble);
    }
}

