package com.miguel.raffles.Customers;

import com.miguel.raffles.Address.Address;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Document
public class Customer {

    @Id
    private String id;

    private String fistName;

    private String lastname;

    private String email;

    private String phoneNumber;

    private Address address;

}
