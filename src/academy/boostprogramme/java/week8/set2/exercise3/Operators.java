package academy.boostprogramme.java.week8.set2.exercise3;

import java.util.List;

public class Operators {

    private static List<Operator> operators = List.of(
            new Sum(),
            new Subtraction(),
            new Multiplication(),
            new Division());

    public static List<Operator> get() {
        return operators;
    }
}
