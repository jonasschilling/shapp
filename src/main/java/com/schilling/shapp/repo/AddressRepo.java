package com.schilling.shapp.repo;

import com.schilling.shapp.model.search.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepo extends MongoRepository<Address, String> {

    void deleteAll();

}
