package com.example.enjoyfoof.models;

public class HomeVerModel {
    int image;
    String name;
    String timing;
    String rating;
    String price;
    public HomeVerModel(int image, String name, String timing, String rating,  String price){
        this.image = image;
        this.name = name;
        this.timing = timing;
        this.rating = rating;
        this.price = price;
    }
    // Getters
    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTiming() {
        return timing;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    // Setters
    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
