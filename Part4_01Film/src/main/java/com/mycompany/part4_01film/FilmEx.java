package com.mycompany.part4_01film;

public class FilmEx {

    public static void main(String[] args) {
        Film film1 = new Film("Terminator", 12);
        System.out.println(film1.filmName());
        System.out.println(film1.ageRating());
        if (film1.ageRating() > 10) {
            System.out.println("You may see " + film1.filmName());

        } else {
            System.out.println("You're not allowed to watch " + film1.filmName());
        }

    }

}
