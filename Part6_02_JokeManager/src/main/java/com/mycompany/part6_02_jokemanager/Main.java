/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6_02_jokemanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author delam
 */
public class Main {

    public static void main(String[] args) {

        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");
        UserInterfaceJoke jokes = new UserInterfaceJoke(manager, scanner);
        jokes.Start();
    }
}
