package com.schilling.shapp.repo;

import com.schilling.shapp.model.general.User;

import java.util.List;
import java.util.Optional;

//public interface UserRepo extends JpaRepository<User, String> {
public interface UserRepo {

        List<User> deleteUserByUsername(String username);
        List<User> getAllUsers();
        Optional<User> findUserByUsername(String username);

}
