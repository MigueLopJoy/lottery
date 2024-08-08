package com.miguel.raffles.Raffles;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.miguel.raffles.Tickets.RaffleTicketsResponse;
import com.miguel.raffles.Tickets.TicketResponse;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
public record RaffleResponse(

        Integer id,

        String title,

        String description,

        LocalDateTime startDate,

        LocalDateTime endDate,

        RaffleStatus status,

        Set<String> photoUrls,

        Set<RaffleTicketsResponse> tickets,

        Integer associationId
) {
}
