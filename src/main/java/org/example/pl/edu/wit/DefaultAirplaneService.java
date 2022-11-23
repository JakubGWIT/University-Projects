package org.example.pl.edu.wit;

import lombok.RequiredArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@RequiredArgsConstructor(access = PROTECTED)
public class DefaultAirplaneService implements AirplaneService {

    private final AirplaneRepository airplaneRepository;
    private final AirplaneFactoryStrategy factoryStrategy;

    @Override
    public Airplane createAirplane(AirplaneCreateCommand command) {
        AirplaneFactory factory = factoryStrategy.getAirplaneFactory(command.getType());
        Airplane airplane = factory.createAirplane(command.getCode(), command.getSeatCounts(), command.getSeatModifier());
        return airplaneRepository.save(airplane);
    }
}