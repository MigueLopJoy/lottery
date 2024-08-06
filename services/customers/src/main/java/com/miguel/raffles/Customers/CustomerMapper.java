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
                .fistName(request.firstName())
                .lastname(request.lastName())
                .email(request.email())
                .phoneNumber(request.phoneNumber())
                .address(
                        addressMapper.toAddress(
                                request.addressRequest()
                        )
                )
                .build();
    }

    public CustomerResponse fromCustomer(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .firstName(customer.getFistName())
                .lastName(customer.getLastname())
                .email(customer.getEmail())
                .phoneNumber(customer.getPhoneNumber())
                .addressResponse(
                        addressMapper.fromAddress(
                                customer.getAddress()
                        )
                )
                .build();
    }


}
