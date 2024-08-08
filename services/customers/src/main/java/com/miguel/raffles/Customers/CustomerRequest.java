package com.miguel.raffles.Customers;

import com.miguel.raffles.Address.AddressRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(

        String id,

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
