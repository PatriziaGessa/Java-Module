package academy.boostprogramme.java.week2.set2.exercise2;

import academy.boostprogramme.java.week2.set2.exercise1.Article;

public class Printer {

    public void print (Magazine magazine) {
        System.out.println(magazine.getTitle());

        for(Article article : magazine.getArticles()) {
            System.out.println();
            print(article);
        }
    }

    public void print(Article article) {
        System.out.println("--" + article.getTitle() + "--");
        System.out.println(article.getText());
    }
}
