package com.schilling.shapp.service.general.impl;

import com.schilling.shapp.exception.UserNotFoundException;
import com.schilling.shapp.model.general.User;
import com.schilling.shapp.repo.UserRepo;
import com.schilling.shapp.service.general.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        //return userRepo.save(user);
        return null;
    }

    public List<User> addSomeUsers(List<User> users) {
        for (User user : users) {
            addUser(user);
        }
        return users;
    }

    public List<User> findAllUsers() {
        //return userRepo.findAll();
        return userRepo.getAllUsers();
    }

    public User updateUser(User user) {
        //return userRepo.save(user);
        return null;
    }

    public User findUserByUsername(String username) {
        return userRepo.findUserByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("User with username " + username + " could not be found."));
    }

    public List<User> deleteUserByUsername(String username) {
        return userRepo.deleteUserByUsername(username);
    }
}