package com.schilling.shapp.repo;

import com.schilling.shapp.model.general.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

//public interface UserRepo extends JpaRepository<User, String> {
public interface UserRepo extends MongoRepository <User, String> {

        public User findByFirstName(String firstName);
        public List<User> findByLastName(String lastName);

        /*
        List<User> deleteUserByUsername(String username);
        List<User> getAllUsers();
        */
        Optional<User> findUserByUsername(String username);

        void deleteAll();
}
