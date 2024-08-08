package com.miguel.raffles.Raffles;

import com.miguel.raffles.Tickets.TicketsService;
import com.miguel.raffles.Exceptions.CustomExceptions.RaffleNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RaffleService {

    private final RafflesRepository repository;
    private final RafflesMapper mapper;

    private final TicketsService ticketsService;

    @Transactional
    public Integer createRaffle(RaffleCreationRequest request) {
        Raffle raffle = mapper.toRaffle(request);
        raffle.setTickets(
                ticketsService.createTickets(request.ticketsInfo(), raffle)
        );
        Raffle savedRaffle = repository.save(raffle);
        return savedRaffle.getId();
    }

    public RaffleResponse getById(Integer id) {
        return mapper.fromRaffle(
                repository.findById(id)
                        .orElseThrow(() -> new RaffleNotFoundException("Raffle not found"))
        );
    }
}
