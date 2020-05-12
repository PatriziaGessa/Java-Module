package academy.boostprogramme.java.week8.set1.exercise4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroCallerTest {

    SuperheroCaller superheroCaller = new SuperheroCaller();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.empty(), ""),
                Arguments.of(Optional.empty(), "batman"),
                Arguments.of(Optional.empty(), "bruce wayne"),
                Arguments.of(Optional.empty(), "Batmon"),
                Arguments.of(Optional.empty(), "12345"),
                Arguments.of(Optional.empty(), "Cat woman"),
                Arguments.of(Optional.of(new Batman()), "Bruce"),
                Arguments.of(Optional.of(new Batman()), "Batman"),
                Arguments.of(Optional.of(new Superman()), "Clark Kent"),
                Arguments.of(Optional.of(new Superman()), "Superman"),
                Arguments.of(Optional.of(new Spiderman()), "Peter Parker"),
                Arguments.of(Optional.of(new Spiderman()), "Spiderman")
        );
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void findSuperheroFindHero(Optional<Superhero> oExpected, String input) {
        Optional<Superhero> oResult = superheroCaller.findSuperhero(input);

        assertEquals(oExpected, oResult);
    }


}