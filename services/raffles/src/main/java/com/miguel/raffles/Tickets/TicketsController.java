package com.miguel.raffles.Tickets;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/tickets")
public class TicketsController {

    private final TicketsService service;


    @GetMapping("/{id}")
    public ResponseEntity<TicketResponse> findById(
            @PathVariable Integer id
    ) {
        return ResponseEntity.ok(service.findById(id));
    }


    @GetMapping("/by-customer")
    public ResponseEntity<TicketResponse> findByCustomer(
            @RequestParam Integer customer
    ) {
        return ResponseEntity.ok(service.findByCustomer(customer));
    }

    @GetMapping("/by-number")
    public ResponseEntity<TicketResponse> findByTicketNumber(
            @RequestParam Long number
    ) {
        return ResponseEntity.ok(service.findByTicketNumber(number));
    }


}
