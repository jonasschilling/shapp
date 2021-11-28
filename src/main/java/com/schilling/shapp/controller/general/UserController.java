package com.schilling.shapp.controller.general;

import com.schilling.shapp.model.general.User;
import com.schilling.shapp.service.general.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/get/{userName}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable("userName") String userName) {
        Optional<User> user = userService.findUserByUsername(userName);
        return new ResponseEntity<Optional<User>>(user, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PostMapping("/addAll")
    public ResponseEntity<Void> addSomeUsers() {
        userService.addSomeUsers();
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    /*@PostMapping("/addAll")
    public ResponseEntity<List<User>> addSomeUsers(@RequestBody List<User> users) {
        List<User> newUsers = userService.addSomeUsers(users);
        return new ResponseEntity<>(newUsers, HttpStatus.CREATED);
    }*/

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    /*@DeleteMapping("/delete/{userName}")
    public ResponseEntity<List<User>> deleteUserById(@PathVariable("userName") String userName) {
        return new ResponseEntity<>(userService.deleteUserByUsername(userName), HttpStatus.OK);
    }*/

    @DeleteMapping("/clear")
    public void clearDatabase() {
        userService.clearDatabase();
    }
}
