package com.miguel.raffles.Raffles;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/raffles")
public class RaffleController {

    private final RaffleService service;

    @PostMapping
    public ResponseEntity<Integer> createRaffle(
            @RequestBody @Valid RaffleCreationRequest request
    ) {
        return ResponseEntity.ok(service.createRaffle(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RaffleResponse> finById(
            @PathVariable Integer id
    ) {
        return ResponseEntity.ok(service.getById(id));
    }
}
