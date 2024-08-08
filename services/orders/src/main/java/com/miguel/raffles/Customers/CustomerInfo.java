package com.miguel.raffles.Customers;

import com.miguel.raffles.Customers.Address.AddressRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CustomerInfo(
        @NotBlank(message = "Firstname should not be blank")
        String firstname,

        @NotBlank(message = "Lastname should not be blank")
        String lastname,

        @NotBlank(message = "Email should not be blank")
        String email,

        @NotBlank(message = "Phone number should not be blank")
        String phoneNumber,

        @NotNull
        AddressRequest address
) {
}
