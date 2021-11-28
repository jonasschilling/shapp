package com.schilling.shapp.service.search.impl.search;

import com.schilling.shapp.model.search.Ad;
import com.schilling.shapp.model.search.Address;
import com.schilling.shapp.repo.AddressRepo;
import com.schilling.shapp.service.search.impl.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    @Autowired
    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public Optional<Address> findAddress(Address address) {
        Optional<Address> foundAddress = addressRepo.findAll().stream().filter(a -> a.equals(address)).findFirst();
        return foundAddress;
    }

    public Address addAddress(Address address) throws Exception {
        if(findAddress(address) != null) {
            addressRepo.save(address);
        } else {
            throw new Exception("Address is already existing.");
        }
        return address;
    }

    public List<Address> addAddresses(List<Address> addresses) throws Exception {
        for (Address a : addresses) {
            addAddress(a);
        }
        return addresses;
    }

    @Override
    public void clearDatabase() {
        addressRepo.deleteAll();
    }

    public Address removeAddress(Address address) {
        addressRepo.delete(address);
        return address;
    }

}
