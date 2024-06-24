package com.example.enjoyfoof.models;

public class HomeVerModel {
    int image;
    String name;
    String timing;
    String racing;
    String price;

    public HomeVerModel(int image, String name, String timing, String racing, String price) {
        this.image = image;
        this.name = name;
        this.timing = timing;
        this.racing = racing;
        this.price = price;
    }

    // Getters et Setters
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getRacing() {
        return racing;
    }

    public void setRacing(String racing) {
        this.racing = racing;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
