package academy.boostprogramme.java.week3.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalculateEpisodeTest {

    TimeCalculateEpisode timeCalculateEpisode = new TimeCalculateEpisode();


    @Test
    void getTotalForFirstSeason() {
        int numbOfEpisodes = 9;

        int totalTime = timeCalculateEpisode.getTotalForFirstSeason(numbOfEpisodes);

        int expected = 378;
        Assertions.assertEquals(expected,totalTime);
    }
}