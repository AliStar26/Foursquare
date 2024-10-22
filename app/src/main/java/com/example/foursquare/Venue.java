package com.example.foursquare;

public class Venue {
    private String name;
    private String address;
    private String phone;

    public Venue(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
