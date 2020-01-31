package academy.boostprogramme.java.week1.set2;

import java.util.List;

public class BiggerAndSmaller {
    public static boolean isBigger(int numbOne, int numbTwo){
        return numbOne > numbTwo;
    }

    public static boolean isSmaller(int numbOne, int numbTwo){
        return numbOne < numbTwo;
    }

    public static int getBiggest(List<Integer> numbs){
        int bigNumb = numbs.get(0);
        for (int number : numbs){
            if(isBigger(bigNumb, number)){
                bigNumb = number;
            }
        }
        return bigNumb;

    }

    public static int getSmallest (List<Integer> numbs){
        int smallNumb = numbs.get(0);
        for (int number : numbs){
            if (isSmaller(smallNumb, number)){
                smallNumb = number;
            }
        }
        return smallNumb;
    }

    public static void main(String[] args) {
        List<Integer> numbs = List.of(-1, 4, 3, 0, 5, 2);
        int theBiggest = getBiggest(numbs);
        int theSmaller = getSmallest(numbs);

        System.out.println("The biggest number is: " + theBiggest);
        System.out.println("The smallest number is:" + theSmaller);
    }

}