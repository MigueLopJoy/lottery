package com.miguel.raffles.Customers;

import com.miguel.raffles.Address.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerMapper {


    private final AddressMapper addressMapper;

    public Customer toCustomer(CustomerRequest request) {
        return Customer.builder()
                .id(request.id())
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .phoneNumber(request.phoneNumber())
                .address(
                        addressMapper.toAddress(
                                request.address()
                        )
                )
                .build();
    }

    public CustomerResponse fromCustomer(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .firstname(customer.getFirstname())
                .lastname(customer.getLastname())
                .email(customer.getEmail())
                .phoneNumber(customer.getPhoneNumber())
                .address(
                        addressMapper.fromAddress(
                                customer.getAddress()
                        )
                )
                .build();
    }


}
