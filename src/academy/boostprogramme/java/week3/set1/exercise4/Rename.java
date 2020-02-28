package academy.boostprogramme.java.week3.set1.exercise4;

public class Rename {

    public String generateNewName(String text) {


        int length = text.length();
        int textWithoutLastPart = length -3;
        String newText = text.substring(0,textWithoutLastPart) + "png";

        return  newText;






    }
}
