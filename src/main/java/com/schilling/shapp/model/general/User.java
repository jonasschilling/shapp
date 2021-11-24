package com.schilling.shapp.model.general;

import com.schilling.shapp.model.search.Address;

import java.util.Objects;

//@Entity
//public class User implements Serializable {
public class User {
    //@Id
    //@Column(nullable = false)
    private String username;
    //@Column(nullable = false)
    private String firstname;
    //@Column(nullable = false)
    private String lastname;
    //@Column(nullable = false)
    private Address address;
    //@Column(nullable = false)
    private char gender;
    //@Column(nullable = false)
    private String email;
    //@Column(nullable = false)
    private String password;

    public User() {};

    public User(String username, String firstname, String lastname, Address address, char gender, String email, String password) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return gender == user.gender && Objects.equals(username, user.username) && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(address, user.address) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, firstname, lastname, address, gender, email, password);
    }
}
