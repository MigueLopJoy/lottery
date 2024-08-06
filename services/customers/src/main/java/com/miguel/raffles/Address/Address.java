package com.miguel.raffles.Address;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Validated
public class Address {

    private String street;

    private String houseNumber;

    private String addressLine2;

    private String city;

    private String province;

    private String zipCode;


}
