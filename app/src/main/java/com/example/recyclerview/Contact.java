package com.example.recyclerview;

public class Contact {
    private String name;
    private String number;
    private String imageUrl;

    public Contact(String name, String number, String imageUrl) {
        this.name = name;
        this.number = number;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}