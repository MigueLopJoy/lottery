package com.miguel.raffles.Address;

import lombok.Builder;

@Builder
public record AddressResponse(
        String street,

        String houseNumber,

        String addressLine2,

        String city,

        String province,

        String zipCode
) {
}
