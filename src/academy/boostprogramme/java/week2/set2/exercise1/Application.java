package academy.boostprogramme.java.week2.set2.exercise1;

public class Application {

    public static void main(String[] args) {
        Article article = new Article(
                "Life Is Beautiful",
                "Buongiorno Principessa!"
        );

    Printer print = new Printer();
    print.print(article);
    }
}
