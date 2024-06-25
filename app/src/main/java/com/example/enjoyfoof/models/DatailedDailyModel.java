package com.example.enjoyfoof.models;

public class DatailedDailyModel {

    int image;
    String name;
    String description;
    String racing;
    String price;

    String timing;

    public DatailedDailyModel(int image, String name, String description, String racing, String price, String timing) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.racing = racing;
        this.price = price;
        this.timing = timing;
    }
    // Getters
    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRacing() {
        return racing;
    }

    public String getPrice() {
        return price;
    }

    public String getTiming() {
        return timing;
    }

    // Setters
    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRacing(String racing) {
        this.racing = racing;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }


}
