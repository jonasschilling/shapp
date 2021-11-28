package com.schilling.shapp;

import com.schilling.shapp.model.general.User;
import com.schilling.shapp.model.search.Address;
import com.schilling.shapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
