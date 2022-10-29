package org.example.pl.edu.wit;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@RequiredArgsConstructor(access = PRIVATE)
public class Ticket {
    private final Flight flight;
    private final Passenger passenger;
    private final Seat seat;
}
