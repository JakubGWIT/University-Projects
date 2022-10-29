package org.example.pl.edu.wit;

import org.example.pl.edu.wit.Airport;

import java.math.BigDecimal;

class SampleAirport {
    public static Airport createAirport(String airportCode, String airportName, String airportCity, BigDecimal airportAirfare) {
        return Airport.create(airportCode, airportName, airportCity, airportAirfare);
    }
}