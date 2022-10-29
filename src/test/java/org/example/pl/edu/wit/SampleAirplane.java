package org.example.pl.edu.wit;

import org.example.pl.edu.wit.Airplane;
import org.example.pl.edu.wit.AirplaneType;

import java.util.Map;
import java.util.Set;

class SampleAirplane {

    public static Airplane createAirplane(String code, AirplaneType type, Set<Seat> seats, Map<SeatType, Float> priceModifiers) {
        return Airplane.builder().code(code).type(type).seats(seats).priceModifiers(priceModifiers).build();
    }

}