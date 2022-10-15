package org.example.pl.edu.wit;

import lombok.Data;

@Data
public class Ticket {
    private final Flight flight;
    private final Passenger passenger;
    private final Seat seat;
}
