package com.miguel.raffles.Customers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(
        name = "customers-service",
        url = "${application.config.customers-url}"
)
public interface CustomerClient {
    @GetMapping("/{id}")
    Optional<CustomerResponse> findCustomerById(@PathVariable("id") String id);
}
