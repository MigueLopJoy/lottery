package com.miguel.raffles.Tickets;

import com.miguel.raffles.Exceptions.CustomExceptions.TicketNotFoundException;
import com.miguel.raffles.Raffles.Raffle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class TicketsService {

    private final TicketsMapper mapper;

    private final TicketsRepository repository;

    public Set<Ticket> createTickets(RaffleTicketsCreationRequest request, Raffle raffle) {
        Set<Ticket> tickets = new HashSet<>();
        for (int i = 0; i < request.amount(); i++) {
            tickets.add(
                    Ticket.builder()
                            .raffle(raffle)
                            .price(request.price())
                            .ticketNumber(i + 1L)
                            .sold(false)
                            .build()
            );
        }
        return tickets;
    }

    public TicketResponse findById(Integer id) {
        return mapper.fromTicketToTicketResponse(
                repository.findById(id)
                        .orElseThrow(() -> new TicketNotFoundException("Ticket not found"))
        );
    }
    public TicketResponse findByCustomer(Integer customer) {
        return null;
    }

    public TicketResponse findByTicketNumber(Long number) {
        return  null;
    }
}
