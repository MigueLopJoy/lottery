package com.miguel.raffles.Tickets;

import com.miguel.raffles.Raffles.Raffle;
import com.miguel.raffles.Raffles.RaffleStatus;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Builder

public record RaffleTicketsResponse(

        Integer id,

        Long ticketNumber,

        Double price,

        Boolean sold,

        Integer customerId
) {
}
