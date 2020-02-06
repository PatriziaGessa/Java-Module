package academy.boostprogramme.java.week1.set1.reflaction.exerciseB;
import java.util.Scanner;

public class RoboMentalist {
    public static void main(String[] args) {
        String text = "say a number from 1 to 10";
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();

        while (numb < 1 || numb > 10) {
            System.out.println(text);
            numb = scanner.nextInt();

        }
        System.out.println("Alright! Let's perform a trick with " + numb);


    }
}
