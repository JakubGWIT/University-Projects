package org.example.pl.edu.wit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.example.pl.edu.wit.AirplaneType.BOEING;
import static org.example.pl.edu.wit.SampleBoeingAirplane.AIRPLANE_BOEING_CODE;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

class DefaultAirplaneServiceTest {

    private final AirplaneRepository repository = Mockito.mock(AirplaneRepository.class);

    private final AirplaneFactoryStrategy factoryStrategy = new AirplaneFactoryStrategy();

    private DefaultAirplaneService subject;

    @BeforeEach
    void setUp() {
        subject = new DefaultAirplaneService(repository, factoryStrategy);
    }

    @Test
    void testAirplaneService() {
        AirplaneCreateCommand build = AirplaneCreateCommand.builder()
                .type(BOEING)
                .code(AIRPLANE_BOEING_CODE)
                .seatDefinitions(Map.of(
                        SeatType.FIRST, AirplaneCreateCommand.SeatDefinition.of(10, 1.1f)
                ))
                .build();

        Mockito.when(repository.save(any())).thenAnswer(invocationOnMock -> invocationOnMock.getArgument(0));

        Airplane airplane = subject.createAirplane(build);

        assertNotNull(airplane);
    }
}
