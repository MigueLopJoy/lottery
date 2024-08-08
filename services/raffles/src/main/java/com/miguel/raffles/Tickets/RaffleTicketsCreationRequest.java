package com.miguel.raffles.Tickets;

import java.math.BigDecimal;

public record RaffleTicketsCreationRequest(
        Integer amount,

        Double price

) {
}
