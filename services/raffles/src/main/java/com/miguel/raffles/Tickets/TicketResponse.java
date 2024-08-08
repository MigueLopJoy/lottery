package com.miguel.raffles.Tickets;

import com.miguel.raffles.Raffles.Raffle;
import lombok.Builder;


@Builder
public record TicketResponse(
        Integer id,

        Raffle raffle,

        Long ticketNumber,

        Double price,

        Boolean sold,

        Integer customerId
) { }
