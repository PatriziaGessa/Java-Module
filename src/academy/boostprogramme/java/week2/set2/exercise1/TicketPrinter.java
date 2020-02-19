package academy.boostprogramme.java.week2.set2.exercise1;

public class TicketPrinter {

    private MovieNamePrinter movieNamePrinter;

    public TicketPrinter(MovieNamePrinter movieNamePrinter) {
        this.movieNamePrinter = movieNamePrinter;
    }

    public void print (String movieName, String date) {
        movieNamePrinter.print (movieName);
        System.out.println("[" + date + "]");
    }
}
