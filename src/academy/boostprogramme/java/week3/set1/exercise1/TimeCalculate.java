package academy.boostprogramme.java.week3.set1.exercise1;

public class TimeCalculate {

    double calculateWalkingTime(double distance) {
        return distance * 15;
    }

    double calculateTramTime(double numbOfStations) {
        return numbOfStations * 4;
    }

    double calculateTotalTime(double numbOfStations, double distanceToTheTram, double distanceToTheHouseOfTheFriend) {
        double timeDistanceToTheTram = calculateWalkingTime(distanceToTheTram);
        double  timeStations = calculateTramTime(numbOfStations);
        double timeWalkingToTheFriendsHouse = calculateWalkingTime(distanceToTheHouseOfTheFriend);

        return timeDistanceToTheTram + timeStations + timeWalkingToTheFriendsHouse;
    }
}
