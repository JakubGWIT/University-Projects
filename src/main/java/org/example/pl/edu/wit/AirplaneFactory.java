package org.example.pl.edu.wit;
import java.util.Map;

public interface AirplaneFactory {
    Airplane createAirplane(String code, Map<SeatType, Integer> seats, Map<SeatType, Float> priceModifiers);
}