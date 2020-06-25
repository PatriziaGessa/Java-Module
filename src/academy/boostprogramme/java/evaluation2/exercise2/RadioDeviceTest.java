package academy.boostprogramme.java.evaluation2.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Optional.*;
import static org.junit.jupiter.api.Assertions.*;

class RadioDeviceTest {

    RadioDevice device = new RadioDevice();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("... --- ..."), new RadioMessage("... --- ...", 1900)),
                Arguments.of(Optional.of("Hello Word"), new RadioMessage("Hello Word", 4200)),
                Arguments.of(Optional.empty(), new RadioMessage("text", 123)),
                Arguments.of(Optional.empty(), new RadioMessage("", 123))
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void receive(Optional<String> expected, RadioMessage message) {
        Optional<String> result = device.receive(message);

        assertEquals(expected, result);
    }
}