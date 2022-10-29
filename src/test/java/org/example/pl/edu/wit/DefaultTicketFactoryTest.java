package org.example.pl.edu.wit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("default ticket factory test")
class DefaultTicketFactoryTest {

    private TicketFactory subject;

    @BeforeEach
    void setupTests() {
        subject = new DefaultTicketFactory();
    }

    @Test
    @DisplayName("should create ticket")
    void shouldCreateTicket() {
        // given
        Flight flight = SampleWawToWroFlight.WAW_WRO_BOEING_FLIGHT;
        Seat seat = SampleSeat.SAMPLE_BUSINESS_SEAT;

        // when
        Ticket ticket = subject.createTicket(flight, seat);

        // then
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(SampleWawToWroFlight.WAW_WRO_BOEING_FLIGHT, ticket.getFlight());
        Assertions.assertEquals(SampleSeat.DEFAULT_BUSINESS_SEAT_NUMBER, ticket.getSeat().getNumber());
    }
}