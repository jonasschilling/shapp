package com.schilling.shapp.service.general;

import com.schilling.shapp.model.general.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    List<User> addSomeUsers(List<User> users);

    List<User> findAllUsers();

    User updateUser(User user);

    User findUserByUsername(String username);

    List<User> deleteUserByUsername(String username);

}
