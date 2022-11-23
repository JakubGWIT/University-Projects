package org.example.pl.edu.wit;

public class AirplaneFactoryStrategy {

    public AirplaneFactory getAirplaneFactory(AirplaneType airplaneType) {
        return switch (airplaneType) {
            case BOEING -> new BoeingAirplaneFactory();
            default -> throw new IllegalArgumentException("cannot resolve factory for plane type " + airplaneType);
        };
    }
}