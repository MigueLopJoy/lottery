package com.miguel.raffles.Tickets;

import com.miguel.raffles.Raffles.RaffleResponse;
import org.springframework.stereotype.Service;

@Service
public class TicketsMapper {

    public TicketResponse fromTicketToTicketResponse(Ticket ticket) {
        return TicketResponse.builder()
                .id(ticket.getId())
                .ticketNumber(ticket.getTicketNumber())
                .raffle(ticket.getRaffle())
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
