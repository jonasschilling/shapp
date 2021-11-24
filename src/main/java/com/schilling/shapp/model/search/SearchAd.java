package com.schilling.shapp.model.search;

import java.util.Objects;
import java.util.Optional;

public class SearchAd extends Ad {
    private double maxRent;
    private Optional<Character> preferredGender;

    public double getMaxRent() {
        return maxRent;
    }

    public void setMaxRent(double maxRent) {
        this.maxRent = maxRent;
    }

    public Optional<Character> getPreferredGender() {
        return preferredGender;
    }

    public void setPreferredGender(Optional<Character> preferredGender) {
        this.preferredGender = preferredGender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SearchAd searchAd = (SearchAd) o;
        return Double.compare(searchAd.maxRent, maxRent) == 0 && preferredGender.equals(searchAd.preferredGender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxRent, preferredGender);
    }
}
