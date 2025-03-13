package domain;

public class Seat extends Entity<Integer> {
    int rideId;
    int number;
    String clientName;

    public Seat(int rideId, int number, String clientName) {
        this.rideId = rideId;
        this.number = number;
        this.clientName = clientName;
    }

    public int getRideId() {
        return rideId;
    }

    public int getNumber() {
        return number;
    }

    public String getClientName() {
        return clientName;
    }
}