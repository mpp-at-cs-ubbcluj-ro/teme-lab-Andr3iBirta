package domain;

import java.time.LocalDateTime;

public class Ride extends Entity<Integer> {
    String destination;
    LocalDateTime departure;
    int availableSeats;

    public Ride(String destination, LocalDateTime departure, int availableSeats) {
        this.destination = destination;
        this.departure = departure;
        this.availableSeats = availableSeats;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
