package academy.boostprogramme.java.week2.set2.exercise2;

import academy.boostprogramme.java.week2.set2.exercise1.Article;

import java.util.List;

public class Editor {

    public Magazine writeMagazine() {
        Article first = new Article(
                "Oil is good for the brain!" ,
                "Ingesting orally hydroxytisol for one month keeps alive the new neurons produced during this period."
        );

        Article second = new Article(
                "The mitochondria",
                "The correct functionality of the mitochondria is necessary to supply the cell with the right amount of energy molecules needed to perform most cellular activities."
        );

        Article third = new Article(
                "Vitamin D, it's actually a hormone!",
                "Vitamin D is not a vitamin at all but a real hormone that regulates calcium metabolism!"
        );

        List<Article> articles = List.of(first, second, third);
        Magazine magazine = new Magazine("Just to know", articles);

        return magazine;



    }
}
