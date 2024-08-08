package com.miguel.raffles.Orders;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrdersService service;

    @PostMapping
    public ResponseEntity<Object> purchase(
            @RequestBody @Valid OrderRequest request
    ) {
        return ResponseEntity.ok(service.purchase(request));
    }

}
