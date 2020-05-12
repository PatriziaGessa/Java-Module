package academy.boostprogramme.java.week8.set1.exercise4;
import academy.boostprogramme.java.week8.set1.exercise4.Batman;
import academy.boostprogramme.java.week8.set1.exercise4.Spiderman;
import academy.boostprogramme.java.week8.set1.exercise4.Superhero;
import academy.boostprogramme.java.week8.set1.exercise4.Superman;

import java.util.List;
import java.util.Optional;

public class SuperheroCaller {

    private Superhero batman = new Batman();
    private Superhero superman = new Superman();
    private Superhero spiderman = new Spiderman();

    private List<Superhero> superheroes;

    public SuperheroCaller() {
        superheroes = List.of(
                batman,
                superman,
                spiderman
        );
    }

    public Optional<Superhero> findSuperhero(String input) {
    return superheroes.stream()
            .filter(superheroes -> superheroes.getPrivateName().equals(input) || superheroes.getSuperHeroName().equals(input))
            .findFirst();
    }
}

