package academy.boostprogramme.java.evaluation1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorEmailRetrieverTest {

    AuthorEmailRetriever retriever = new AuthorEmailRetriever();

    @Test
    void retriever() {
        User patrizia = new User("patrizia@laBella","12345");
        Comment comment = new Comment("Vitamin D", "Vitamin D is actually a hormone and not a vitamin", patrizia);
        String expected = "patrizia@laBella";
        String result = retriever.retriever(comment);

        Assertions.assertEquals(expected,result);
    }
}