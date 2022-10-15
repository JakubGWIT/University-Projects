package org.example.pl.edu.wit;

import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class Airplane {
    private final String code;
    private final Map<SeatType, Float> primeModifier;
    private final AirplaneType type;
    private final Set<Seat> seats;
}
