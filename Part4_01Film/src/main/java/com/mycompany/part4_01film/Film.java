package com.mycompany.part4_01film;

public class Film {

    private String name;
    private int ageRating;

    public Film() {
    }

    public Film(String name, int ageRating) {
        this.name = name;
        this.ageRating = ageRating;
    }

    public String filmName() {
        return name;
    }

    public int ageRating() {
        return ageRating;
    }
}
