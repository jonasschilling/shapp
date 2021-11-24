package com.schilling.shapp.model.manage;

import java.util.Objects;

public class Item {
    private long id;
    private String productName;
    private String quantity;
    private String notes;
    private boolean bought;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && bought == item.bought && productName.equals(item.productName) && quantity.equals(item.quantity) && notes.equals(item.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, quantity, notes, bought);
    }
}
