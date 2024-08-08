package com.miguel.raffles.Tickets;

import com.miguel.raffles.Raffles.RaffleResponse;
import com.miguel.raffles.Raffles.RafflesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TicketsMapper {

    private final RafflesMapper rafflesMapper;

    public TicketResponse fromTicketToTicketResponse(Ticket ticket) {

        RaffleResponse raffle = rafflesMapper.fromRaffle(ticket.getRaffle());

        return TicketResponse.builder()
                .id(ticket.getId())
                .ticketNumber(ticket.getTicketNumber())
                .raffle(raffle)
                .sold(ticket.getSold())
                .price(ticket.getPrice())
                .customerId(ticket.getCustomerId())
                .build();
    }

    public RaffleTicketsResponse fromTicketToRaffleTicketsResponse(Ticket ticket) {
        return RaffleTicketsResponse.builder()
                .id(ticket.getId())
                .ticketNumber(ticket.getTicketNumber())
                .sold(ticket.getSold())
                .price(ticket.getPrice())
                .customerId(ticket.getCustomerId())
                .build();
    }
}
