package org.example.pl.edu.wit;

public interface TicketFactory {
    Ticket createTicket(Flight flight, Seat seat);

    Ticket createTicket(Flight flight, Passenger passenger, Seat seat);

    Ticket createBusinessTicket(Flight flight, Passenger passenger, String seatNumber);
}