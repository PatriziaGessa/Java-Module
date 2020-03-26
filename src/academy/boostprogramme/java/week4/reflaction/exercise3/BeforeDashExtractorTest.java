package academy.boostprogramme.java.week4.reflaction.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BeforeDashExtractorTest {

    BeforeDashExtractor beforeDashExtractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "'', AlphaBetaGammaDelta",
            "Alpha, Alpha-Beta-Gamma-Delta",
            "A, A-l-p-h-a-",
            "Alpha, Alpha-",
            "'', -Alpha",
            "'0', '0-1-2-3-'",
            "'', '012345678910'",

    })
    void extract(String expected, String input) {

        String result = beforeDashExtractor.extract(input);
        Assertions.assertEquals(expected,result);
    }
}