package com.schilling.shapp.service.general.impl;

import com.schilling.shapp.model.general.User;
import com.schilling.shapp.model.search.Address;
import com.schilling.shapp.repo.UserRepo;
import com.schilling.shapp.service.general.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void addSomeUsers() {
        Address ub6 = new Address("Untere Breite Straße", "6", "88212", "Ravensburg", "Germany");

        User jonas = new User("jonasschilling", "Jonas", "Schilling", ub6, 'm', "schilling.jonas1@web.de", "password123");
        User linus = new User("linusbrugger", "Linus", "Brugger", ub6, 'm', "linus@brugger-rv.de", "password123");
        User anna = new User("annazeller", "Anna", "Zeller", ub6, 'f', "annazeller@gmx.de", "password123");

        userRepo.save(jonas);
        userRepo.save(linus);
        userRepo.save(anna);
    }

//    public List<User> addSomeUsers(List<User> users) {
//        for (User user : users) {
//            addUser(user);
//        }
//        return users;
//    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
//        return userRepo.getAllUsers();
    }

    public User updateUser(User user) {
        //return userRepo.save(user);
        return null;
    }

    public Optional<User> findUserByUsername(String userName) {
        return findAllUsers().stream().filter(u -> userName.equals(u.getUsername())).findFirst();
//        return userRepo.findUserByUsername(userName)
//                .orElseThrow(() -> new UserNotFoundException("User with userName " + userName + " could not be found."));
    }

    @Override
    public void clearDatabase() {
        userRepo.deleteAll();
    }

    /*public List<User> deleteUserByUsername(String userName) {
        return userRepo.deleteUserByUsername(userName);
    }*/
}