package academy.boostprogramme.java.week4.reflaction.exercise2;

public class FromZeroRounder {

    public double round (double numb){
        if(numb < 0.0) {
            return Math.floor(numb);

        }else
            return Math.ceil(numb);

    }

    public static void main(String[] args) {
        FromZeroRounder fromZeroRounder = new FromZeroRounder();

        double input = -10.11;
        double result = fromZeroRounder.round(input);
        System.out.println(result);


    }


}
