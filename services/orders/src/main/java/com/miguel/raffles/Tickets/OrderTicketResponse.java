package com.miguel.raffles.Tickets;

public record OrderTicketResponse(
        Integer id,

        Integer raffleId,

        Long ticketNumber,

        Double price,

        Boolean sold,

        Integer customerId
) {
}
