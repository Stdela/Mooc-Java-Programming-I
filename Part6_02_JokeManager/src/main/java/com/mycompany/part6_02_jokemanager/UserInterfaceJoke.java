/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6_02_jokemanager;

import java.util.Scanner;

/**
 *
 * @author delam
 */
public class UserInterfaceJoke {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterfaceJoke() {
    }

    public UserInterfaceJoke(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void Start() {

        while (true) {
            System.out.println("Welcome, commands accepted are : x to break, 1 to add joke, 2 to draw a random joke, 3 for print all jokes, have fun!");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("x")) {
                break;
            } else if (command.equalsIgnoreCase("1")) {
                this.adding();
            } else if (command.equalsIgnoreCase("2")) {
                this.drawing();
            } else if (command.equalsIgnoreCase("3")) {
                this.printing();
            }

        }
    }

    public JokeManager adding() {
        System.out.println("Insert your joke to be added!");
        String joke = scanner.nextLine();
        this.jokes.addJoke(joke);
        return this.jokes;
    }

    public void drawing() {
        System.out.println("All right, drawing a random joke");
        System.out.println(this.jokes.drawJokes());
    }

    public void printing() {
        System.out.println("Ok, printing all jokes");
        this.jokes.printJokes();
    }
}
