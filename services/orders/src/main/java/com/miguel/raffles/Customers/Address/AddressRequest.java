package com.miguel.raffles.Customers.Address;

import jakarta.validation.constraints.NotBlank;

public record AddressRequest(
        @NotBlank(message = "Street should not be blank")
        String street,

        @NotBlank(message = "House number should not be blank")
        String houseNumber,

        String addressLine2,

        @NotBlank(message = "City should not be blank")
        String city,

        @NotBlank(message = "Province should not be blank")
        String province,

        @NotBlank(message = "Zip code should not be blank")
        String zipCode
) {
}
