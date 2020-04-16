package academy.boostprogramme.java.evaluation1.exercise1;

public class AuthorEmailRetriever {

    public String retriever(Comment comment) {
        return comment.getAuthor().getEmail();
    }
}
