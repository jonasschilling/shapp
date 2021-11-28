package com.schilling.shapp.controller.search;

import com.schilling.shapp.model.search.Address;
import com.schilling.shapp.service.search.impl.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAllAddresses() {
        return new ResponseEntity<List<Address>>(addressService.getAllAddresses(), HttpStatus.OK);
    }

    @GetMapping("/find")
    public ResponseEntity<Optional<Address>> findAddress(@RequestBody Address address) {
        return new ResponseEntity<Optional<Address>>(addressService.findAddress(address), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Address> addAddress(@RequestBody Address address) throws Exception {
        return new ResponseEntity<Address>(addressService.addAddress(address), HttpStatus.CREATED);
    }

    @PostMapping("/addAll")
    public ResponseEntity<List<Address>> addAddressList(@RequestBody List<Address> addressList) throws Exception {
        return new ResponseEntity<List<Address>>(addressService.addAddresses(addressList), HttpStatus.CREATED);
    }

    @DeleteMapping("/clear")
    public void clearDatabase() {
        addressService.clearDatabase();
    }

}
