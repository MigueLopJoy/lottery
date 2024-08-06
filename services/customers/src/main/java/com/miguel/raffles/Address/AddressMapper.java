package com.miguel.raffles.Address;

import org.springframework.stereotype.Service;

@Service
public class AddressMapper {

    public AddressResponse fromAddress(Address address) {
        return AddressResponse.builder()
                .street(address.getStreet())
                .houseNumber(address.getHouseNumber())
                .addressLine2(address.getAddressLine2())
                .city(address.getCity())
                .province(address.getProvince())
                .zipCode(address.getZipCode())
                .build();
    }

    public Address toAddress(AddressRequest request) {
        return Address.builder()
                .street(request.street())
                .houseNumber(request.houseNumber())
                .addressLine2(request.addressLine2())
                .city(request.city())
                .province(request.province())
                .zipCode(request.zipCode())
                .build();
    }

}
