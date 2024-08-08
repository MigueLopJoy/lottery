package com.miguel.raffles.Raffles;

import com.miguel.raffles.Tickets.RaffleTicketsResponse;
import com.miguel.raffles.Tickets.TicketResponse;
import com.miguel.raffles.Tickets.TicketsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class RafflesMapper {

    private final TicketsMapper ticketsMapper;

    public Raffle toRaffle(RaffleCreationRequest request) {
        return Raffle.builder()
                .title(request.title())
                .description(request.description())
                .startDate(request.startDate())
                .endDate(request.endDate())
                .status(RaffleStatus.PENDING)
                .photoUrls(request.photoUrls())
                .associationId(request.associationId())
                .photoUrls(request.photoUrls())
                .build();
    }

    public RaffleResponse fromRaffle(Raffle raffle) {

        Set<RaffleTicketsResponse> tickets = raffle.getTickets()
                .stream()
                .map(ticketsMapper::fromTicketToRaffleTicketsResponse)
                .collect(Collectors.toSet());

        return RaffleResponse.builder()
                .title(raffle.getTitle())
                .description(raffle.getDescription())
                .tickets(tickets)
                .status(raffle.getStatus())
                .startDate(raffle.getStartDate())
                .endDate(raffle.getEndDate())
                .associationId(raffle.getAssociationId())
                .photoUrls(raffle.getPhotoUrls())
                .build();
    }
}
