package academy.boostprogramme.java.evaluation2.exercise3;

import java.util.List;

public class MysteryBoxes {

    private static List<MysteryBox> boxes = List.of(
            new SparePartsBox(1), new WeaponsUpgradeBox(1),
            new SparePartsBox(2), new WeaponsUpgradeBox(2)
    );

    public static List<MysteryBox> get(List<MysteryBox> mysteryBoxes) {
        return boxes;
    }
}