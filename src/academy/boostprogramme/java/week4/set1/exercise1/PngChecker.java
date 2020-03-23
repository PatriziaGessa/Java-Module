package academy.boostprogramme.java.week4.set1.exercise1;

public class PngChecker {

  public boolean check (String file) {

        int numbMinimum = 4;
        int length = file.length();

        if(length < numbMinimum){
            return false;
        }

        int start = length - numbMinimum;
        String substring = file.substring(start,length);
        return substring.equalsIgnoreCase(".png");

   }

    public static void main(String[] args) {
      PngChecker pngChecker = new PngChecker();
      String file = "Hello.png";

      Boolean result = pngChecker.check(file);
        System.out.println(result);

    }
}
