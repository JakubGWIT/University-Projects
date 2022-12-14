package org.example.pl.edu.wit;

import java.util.Map;
import java.util.Set;

import static org.example.pl.edu.wit.AirplaneType.BOEING;
import static org.example.pl.edu.wit.SampleSeat.getSeats;
import static org.example.pl.edu.wit.Seat.createBusinessClass;
import static org.example.pl.edu.wit.SeatType.*;

public class SampleBoeingAirplane extends SampleAirplane {

    public static final String AIRPLANE_BOEING_CODE = "747-100";
    public static final AirplaneType AIRPLANE_BOEING_TYPE = BOEING;
    public static final Map<SeatType, Integer> AIRPLANE_BOEING_SEAT_COUNT = Map.of(ECONOMY, 100, BUSINESS, 20, FIRST, 10);
    public static final Set<Seat> AIRPLANE_BOEING_SEATS = getSeats(100, 20, 10, "B", "E", "B", "F");
    public static final Map<SeatType, Float> AIRPLANE_BOEING_PRICES = Map.ofEntries(
            Map.entry(ECONOMY, 1.0F),
            Map.entry(BUSINESS, 1.2F),
            Map.entry(FIRST, 1.4F)
    );
    public static final Set<Seat> AIRPLANE_BOEING_TAKEN_SEATS = Set.of(
            createBusinessClass("B5"),
            createBusinessClass("B10"),
            SampleSeat.creatEconomyClass("E14"),
            SampleSeat.creatEconomyClass("E16"),
            SampleSeat.creatEconomyClass("E15")
    );

    public static final Airplane AIRPLANE_BOEING = createAirplane(AIRPLANE_BOEING_CODE, AIRPLANE_BOEING_TYPE, AIRPLANE_BOEING_SEATS, AIRPLANE_BOEING_PRICES);

}