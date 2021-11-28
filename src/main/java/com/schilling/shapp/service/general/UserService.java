package com.schilling.shapp.service.general;

import com.schilling.shapp.model.general.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User addUser(User user);

//    List<User> addSomeUsers(List<User> users);

    void addSomeUsers();

    List<User> findAllUsers();

    User updateUser(User user);

    Optional<User> findUserByUsername(String username);

//    List<User> deleteUserByUsername(String username);

    void clearDatabase();

}
