package academy.boostprogramme.java.week3.set2.exercise5;

public class PowerCalculator {

    public  double calculate(double base, int exponent) {
        if(base == 0) {
            return 0;
        }

        double result = 1;
        if(exponent < 0) {
            exponent = exponent * -1;
            base = 1 / base;
        }

        for(int i = 1; i < exponent; i++) {
            result = result * base;
        }

        return result;


    }
}
