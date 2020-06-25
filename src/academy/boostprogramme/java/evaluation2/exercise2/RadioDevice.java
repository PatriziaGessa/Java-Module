package academy.boostprogramme.java.evaluation2.exercise2;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class RadioDevice {

    private List<RadioAntenna> antennaList = List.of(
            new Antenna3G(),
            new Antenna5G()
    );

    public Optional<String> receive(RadioMessage message) {
        return antennaList.stream()
                .filter(getRadioAntenna(message))
                .map(text-> message.getContent())
                .findFirst();
    }

    private Predicate<RadioAntenna> getRadioAntenna(RadioMessage message) {
        return radioAntenna -> radioAntenna.getFrequency() == message.getFrequency();
    }
}
