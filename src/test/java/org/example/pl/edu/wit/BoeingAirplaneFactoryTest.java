package org.example.pl.edu.wit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.example.pl.edu.wit.SampleBoeingAirplane.*;

@DisplayName("airplane default factory tests")
class BoeingAirplaneFactoryTest {

    private final AirplaneFactory subject = new BoeingAirplaneFactory();

    @Test
    @DisplayName("should create default airplane")
    void shouldCreateBoeingAirplane() {

        Airplane boeing = subject.createAirplane(AIRPLANE_BOEING_CODE, AIRPLANE_BOEING_SEAT_COUNT, AIRPLANE_BOEING_PRICES);

        assertNotNull(boeing);
        assertEquals(AIRPLANE_BOEING_CODE, boeing.getCode());
        assertEquals(AIRPLANE_BOEING_TYPE, boeing.getType());
        assertEquals(AIRPLANE_BOEING_PRICES, boeing.getPriceModifiers());
    }
}