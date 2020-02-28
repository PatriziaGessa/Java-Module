package academy.boostprogramme.java.week3.set1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class TheLastBeFirst {

    public List<Integer> reverse(List<Integer> numbers) {
        ArrayList<Integer> numbersReverse = new ArrayList<>();

        for(int i = numbers.size()-1; i >=0; i--) {
            numbersReverse.add(numbers.get(i));
        }

        return numbersReverse;
    }


}
