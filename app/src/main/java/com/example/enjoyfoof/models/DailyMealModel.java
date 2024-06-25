package com.example.enjoyfoof.models;

public class DailyMealModel {
    int image;
    String name;
    String discount;
    String type;
    String description;

    // Constructeur
    public DailyMealModel(int image, String name, String discount, String type, String description) {
        this.image = image;
        this.name = name;
        this.discount = discount;
        this.type = type;
        this.description = description;
    }

    // Getters
    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
