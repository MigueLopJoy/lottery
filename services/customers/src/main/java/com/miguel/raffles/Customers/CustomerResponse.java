package com.miguel.raffles.Customers;

import com.miguel.raffles.Address.AddressResponse;
import lombok.Builder;

@Builder
public record CustomerResponse(

        String id,

        String firstName,

        String lastName,

        String email,

        String phoneNumber,

        AddressResponse addressResponse

) {
}
