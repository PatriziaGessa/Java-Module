package academy.boostprogramme.java.week2.set2.exercise1;

public class Application {
    public static void main(String[] args) {
        MovieNamePrinter movieNamePrinter = new MovieNamePrinter();
        TicketPrinter ticketPrinter = new TicketPrinter(movieNamePrinter);

        ticketPrinter.print("Titanic" , "20th of December 1997");



    }
}
