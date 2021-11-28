package com.schilling.shapp.datastore;

import com.schilling.shapp.model.general.User;
import com.schilling.shapp.model.search.Address;
import com.schilling.shapp.repo.UserRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
//public class FakeUserProfileDataStore implements UserRepo {
public class FakeUserProfileDataStore {

    private static final List<User> USERS = new ArrayList<>();
    private static final List<Address> ADDRESS_LIST = new ArrayList<>();

    static {

        ADDRESS_LIST.add(new Address("Untere Breite Straße", "6", "88212", "Ravensburg", "Germany"));

        USERS.add(new User("jonasschilling", "Jonas", "Schilling", ADDRESS_LIST.get(0), 'm', "schilling.jonas1@web.de", "password123"));
        USERS.add(new User("linusbrugger", "Linus", "Brugger", ADDRESS_LIST.get(0), 'm', "linus@brugger-rv.de", "password123"));
        USERS.add(new User("annazeller", "Anna", "Zeller", ADDRESS_LIST.get(0), 'f', "annazeller@gmx.de", "password123"));

    }

    //@Override
    public List<User> getAllUsers() {
        return USERS;
    }

    //@Override
    public List<User> deleteUserByUsername(String userName) {
        USERS.remove(getUserByUsername(userName));
        return USERS;
    }

    //@Override
    public Optional<User> findUserByUsername(String userName) {
        return getUserByUsername(userName);
    }

    private Optional<User> getUserByUsername(String userName) {
        return USERS.stream().filter(u -> u.getUsername().equals(userName)).findFirst();
    }
}
