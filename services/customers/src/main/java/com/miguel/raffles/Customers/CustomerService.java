package com.miguel.raffles.Customers;

import com.miguel.raffles.Exceptions.CustomExceptions.CustomerNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository repository;

    private final CustomerMapper mapper;


    public CustomerResponse createCustomer(CustomerRequest request) {
        return this.mapper.fromCustomer(
                this.repository.save(
                        mapper.toCustomer(request)
                )
        );
    }

    public CustomerResponse findById(String id) {
        return this.mapper.fromCustomer(
                this.repository.findById(id)
                        .orElseThrow(() -> new CustomerNotFoundException("Customer not found"))
        );
    }
}
