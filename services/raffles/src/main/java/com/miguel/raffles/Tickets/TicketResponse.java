package com.miguel.raffles.Tickets;

import com.miguel.raffles.Raffles.RaffleResponse;
import lombok.Builder;


@Builder
public record TicketResponse(
        Integer id,

        RaffleResponse raffle,

        Long ticketNumber,

        Double price,

        Boolean sold,

        Integer customerId
) { }
