package academy.boostprogramme.java.week4.set2.exercise5;

public class TipAdder {

    public  double add (double amount) {

        double amountWithPercent = ((amount / 100) * 5) + amount;
        double ceil = Math.ceil(amountWithPercent);
        double cents =(1 - ceil + amountWithPercent) * 100;
        if(cents > 50){
            return ceil;
        }

        return ceil - 0.50;


    }

    public static void main(String[] args) {

        TipAdder tipAdder = new TipAdder();
        double input = 0.3;
        double result = tipAdder.add(input);

        System.out.println(result);
    }




}
