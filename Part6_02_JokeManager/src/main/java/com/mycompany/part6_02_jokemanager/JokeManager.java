/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6_02_jokemanager;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author delam
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public JokeManager(ArrayList<String> jokes) {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJokes() {
        int joke = (int) (Math.random() * this.jokes.size());
        return this.jokes.get(joke);

    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
