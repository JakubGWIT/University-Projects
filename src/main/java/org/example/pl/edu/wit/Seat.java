package org.example.pl.edu.wit;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import static lombok.AccessLevel.PRIVATE;
import static org.example.pl.edu.wit.SeatType.*;

@Data
@RequiredArgsConstructor(access = PRIVATE)
public class Seat {
    private final SeatType type;
    private final String number;

    public static Seat createBusinessClass(String number) {
        return new Seat(BUSINESS, number);
    }

    public static Seat createFirstClass(String number) {
        return new Seat(FIRST, number);
    }

    public static Seat createEconomyClass(String number) {
        return new Seat(ECONOMY, number);
    }

}
