package academy.boostprogramme.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;



public class LineSumCalculator {

    public int calculate (String string) {
        if(string.isEmpty()){
            return string.length();
        }
        StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();
        List<Integer> integers = stringAsIntegerListParser.parse(string);

        int sum = 0;
        for (Integer integer : integers) {
            sum = sum + integer;
        }


        return sum;

    }
}
