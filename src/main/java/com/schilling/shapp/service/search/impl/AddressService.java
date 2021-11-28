package com.schilling.shapp.service.search.impl;

import com.schilling.shapp.model.search.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<Address> getAllAddresses();
    Optional<Address> findAddress(Address address);
    Address addAddress(Address address) throws Exception;
    List<Address> addAddresses(List<Address> addresses) throws Exception;
    void clearDatabase();

}
