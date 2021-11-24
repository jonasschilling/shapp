package com.schilling.shapp.model.search;

import com.schilling.shapp.model.general.User;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Ad {
    private UUID adId;
    private String title;
    private Address address;
    private Date moveInDate;
    private User creator;

    public UUID getAdId() {
        return adId;
    }

    public void setAdId(UUID adId) {
        this.adId = adId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(Date moveInDate) {
        this.moveInDate = moveInDate;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return adId.equals(ad.adId) && title.equals(ad.title) && address.equals(ad.address) && moveInDate.equals(ad.moveInDate) && creator.equals(ad.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adId, title, address, moveInDate, creator);
    }
}
