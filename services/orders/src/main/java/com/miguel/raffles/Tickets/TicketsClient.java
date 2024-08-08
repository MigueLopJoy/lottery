package com.miguel.raffles.Tickets;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "customer-service",
        url = "${application.config.customer-url}"
)
public interface TicketsClient {
}
