package com.schilling.shapp.model.search;

import com.schilling.shapp.model.general.Shapp;

import java.util.Objects;
import java.util.Optional;

public class OfferingAd extends Ad {
    private double rent;
    private Shapp shapp;
    private Optional<Character> gender;

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Shapp getShapp() {
        return shapp;
    }

    public void setShapp(Shapp shapp) {
        this.shapp = shapp;
    }

    public Optional<Character> getGender() {
        return gender;
    }

    public void setGender(Optional<Character> gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OfferingAd that = (OfferingAd) o;
        return Double.compare(that.rent, rent) == 0 && shapp.equals(that.shapp) && gender.equals(that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rent, shapp, gender);
    }
}
