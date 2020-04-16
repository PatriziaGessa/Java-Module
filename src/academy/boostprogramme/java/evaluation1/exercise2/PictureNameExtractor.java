package academy.boostprogramme.java.evaluation1.exercise2;

public class PictureNameExtractor {

    public String extract(String filename) {
        String text = getSubstring(filename);
        String textInLowerCase = text.toLowerCase();
        return getReplaced(textInLowerCase);
    }



    private String getSubstring(String string) {
        int start = 8;
        int end = string.length()-7;
        return string.substring(start,end);
    }


    private String getReplaced(String string) {
        return string.replaceAll("-", " ");
    }



}
