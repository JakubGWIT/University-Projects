package org.example.pl.edu.wit;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Data(staticConstructor = "create")
public class Flight {
    private final Airport to;
    private final Airplane airplane;
    private final LocalDateTime date;
    private final BigDecimal baseCost;
    private final LocalTime boarding;
    private final String number;
    private final Airport from;
    private final Set<Seat> takenSeats;
}
