package com.schilling.shapp.model.manage;

import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private long id;
    private String title;
    private List<Item> items;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return id == that.id && title.equals(that.title) && items.equals(that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, items);
    }
}
