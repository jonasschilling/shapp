package com.schilling.shapp.model.search;

import java.util.Objects;

public class Address {
    private long id;
    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private String country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id == address.id && street.equals(address.street) && houseNumber.equals(address.houseNumber) && postalCode.equals(address.postalCode) && city.equals(address.city) && country.equals(address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, street, houseNumber, postalCode, city, country);
    }
}
