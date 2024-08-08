package com.miguel.raffles.Tickets;

public record OrderTicketRequest(
        Integer id,
        Integer ticketNumber,
        Double price,
        Integer raffleId
) {
}
