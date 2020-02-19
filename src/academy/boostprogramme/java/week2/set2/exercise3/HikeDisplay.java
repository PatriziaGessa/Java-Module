package academy.boostprogramme.java.week2.set2.exercise3;

public class HikeDisplay {

    public void display(Hike hike) {
        System.out.println("Hike " + hike.getDatedate());

        for (Hiker hiker : hike.getHikers()) {
            System.out.println(hiker.getName());
        }
    }
}
