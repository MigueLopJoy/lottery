package com.miguel.raffles.Customers.Address;

import lombok.Builder;

public record AddressResponse(
        String street,

        String houseNumber,

        String addressLine2,

        String city,

        String province,

        String zipCode
) {
}
