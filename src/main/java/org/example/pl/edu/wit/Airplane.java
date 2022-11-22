package org.example.pl.edu.wit;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;
import java.util.Set;

@Data
@Builder
public class Airplane {
    private final String code;
    private final Map<SeatType, Float> priceModifiers;
    private final AirplaneType type;
    private final Set<Seat> seats;
    private final String cos;
}