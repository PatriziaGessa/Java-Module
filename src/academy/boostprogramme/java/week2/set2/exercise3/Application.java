package academy.boostprogramme.java.week2.set2.exercise3;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        HikerGatherer hikerGatherer = new HikerGatherer();
        List<Hiker> hikers = hikerGatherer.gather();
        Hike hike = new Hike("5th of September", hikers);

        HikeDisplay hikeDisplay = new HikeDisplay();
        hikeDisplay.display(hike);
    }
}
