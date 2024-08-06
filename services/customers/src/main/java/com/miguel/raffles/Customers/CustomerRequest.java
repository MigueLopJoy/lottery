package com.miguel.raffles.Customers;

import com.miguel.raffles.Address.AddressRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(

        @NotBlank(message = "Firstname should not be blank")
        String firstName,

        @NotBlank(message = "Lastname should not be blank")
        String lastName,

        @NotBlank(message = "Email should not be blank")
        String email,

        @NotBlank(message = "Phone number should not be blank")
        String phoneNumber,

        @NotNull
        AddressRequest addressRequest
) {
}
