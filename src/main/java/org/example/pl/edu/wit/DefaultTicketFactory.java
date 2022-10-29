package org.example.pl.edu.wit;

class DefaultTicketFactory implements TicketFactory {

    @Override
    public Ticket createTicket(final Flight flight, final Seat seat) {
        return Ticket.builder()
                .flight(flight)
                .seat(seat)
                .build();
    }

    @Override
    public Ticket createTicket(Flight flight, Passenger passenger, Seat seat) {
        return Ticket.builder()
                .flight(flight)
                .passenger(passenger)
                .seat(seat)
                .build();
    }

    @Override
    public Ticket createBusinessTicket(Flight flight, Passenger passenger, String seatNumber) {
        Seat seat = Seat.createBusinessClass(seatNumber);
        return createTicket(flight, passenger, seat);
    }
}