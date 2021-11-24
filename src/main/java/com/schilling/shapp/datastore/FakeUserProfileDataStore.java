package com.schilling.shapp.datastore;

import com.schilling.shapp.model.UserProfile;
import com.schilling.shapp.model.general.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeUserProfileDataStore {

    private static final List<User> USERS = new ArrayList<>();

    static {

        USERS.add(new User("jonasschilling", "Jonas", "Schilling", 'm', "schilling.jonas1@web.de", "password123"));
        USERS.add(new User("linusbrugger", "Linus", "Brugger", 'm', "linus@brugger-rv.de", "password123"));
        USERS.add(new User("annazeller", "Anna", "Zeller", 'f', "annazeller@gmx.de", "password123"));

    }

    public List<User> getUsers() {
        return USERS;
    }

}
