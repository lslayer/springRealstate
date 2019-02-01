package ua.foxmind.retail.model;

public class Item {
    int itmeId;
    String address;
    String description;
    int squre;
    int price;

    public Item() {
    }

    public Item(int itmeId, String address, String description, int squre, int price) {
        this.itmeId = itmeId;
        this.address = address;
        this.description = description;
        this.squre = squre;
        this.price = price;
    }

    public int getItmeId() {
        return itmeId;
    }

    public void setItmeId(int itmeId) {
        this.itmeId = itmeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSqure() {
        return squre;
    }

    public void setSqure(int squre) {
        this.squre = squre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Item: {itmeId: %s, address: %s, description: %s. squre: %s, price: %s}", itmeId, address, description, squre, price);
    }
}
