package com.schilling.shapp.datastore;

import com.schilling.shapp.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("a44e75c7-3292-42b7-847b-0ca64cacbd25"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("0e9254d6-65ee-4920-b4f6-664488c72dba"), "antoniojunior", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("16b13d1c-4cf3-43ae-8c45-bd4a51936b3a"), "jonasschilling", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
