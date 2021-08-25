package com.mycompany.part6_01menu;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String comida) {
        if (!(this.meals.contains(comida))) {
            this.meals.add(comida);
        }

    }

    public void printMenu() {
        for (String meals : meals) {
            System.out.println(meals);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Object)) {
            return false;
        }
        Menu newMenu = (Menu) o;
        return this.meals.equals(newMenu.meals);
    }

    public void clearMenu() {
        this.meals.clear();
    }

}
