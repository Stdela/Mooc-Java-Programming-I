package com.mycompany.part6_01menu;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");
        menu.printMenu();
        menu.clearMenu();
        System.out.println("------------------------------");
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMenu();
    }

}

// while(true){
//        String name = lectura.nextLine();
//        if (name.isEmpty()) {
//            break;
//            
//        }
//        Menu menu = new Menu(name);
//        if (!(menu1.contains(menu))) {
//            
//        }
//        menu1.add(new Menu(name));
//    }
