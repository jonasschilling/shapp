package com.schilling.shapp.repo;

import com.schilling.shapp.model.general.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, String> {

        void deleteUserByUsername(String username);

        Optional<User> findUserByUsername(String username);

}
