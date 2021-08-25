package com.mycompany.part5_04songs;

public class Main {

    public static void main(String[] args) {
        Songs song1 = new Songs("The Lonely Island", "Jack Sparrow", 196);
        Songs song2 = new Songs("The Lonely Island", "Jack Sparrow", 196);
        Songs song3 = new Songs("Oi Josuke", "Nijimura Okuyasu", 196);
        if (song1.songsCompared(song2)) {
            System.out.println("Songs are equal");

        }
        if (song1.songsCompared(song3)) {
            System.out.println("Songs aren't equal");
        } else {
            System.out.println("Songs aren't equal");
        }
    }
}
