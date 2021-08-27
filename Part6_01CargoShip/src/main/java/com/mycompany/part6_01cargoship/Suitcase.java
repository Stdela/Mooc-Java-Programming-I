package com.mycompany.part6_01cargoship;

import java.util.ArrayList;

/**
 *
 * @author delam
 */
public class Suitcase {

    private int MaxWeight;
    private ArrayList<Item> items;

    public Suitcase() {

    }

    public Suitcase(int MaxWeight) {
        this.items = new ArrayList<>();
        this.MaxWeight = MaxWeight;

    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "List is empty";
        } else {
            if (this.items.size() == 1) {
                return this.items.size() + " item" + this.totalWeight() + " kilos";

            } else {
                return this.items.size() + " items, " + this.totalWeight() + " kilos";
            }
        }
    }

    public void add(Item items) {
        int aux1 = 0;
        aux1 += items.getWeight();
        this.MaxWeight = this.MaxWeight - aux1;
        if (this.MaxWeight >= 0) {
            this.items.add(items);

        } else {
            System.out.println("Error, item cannot be added");
        }

    }

    public int totalWeight() {
        int aux1 = 0;
        for (Item arts : this.items) {
            aux1 += arts.getWeight();

        }
        return aux1;
    }

    public void printItems1() {
        for (Item item : this.items) {
            System.out.println(item.getName());
        }
    }

    public Item heaviestItem() {
        Item case1 = new Item();
        case1 = this.items.get(0);
        for (Item elements : items) {
            if (case1.getWeight() < elements.getWeight()) {
                case1 = elements;
            }
        }

        return case1;

    }
}
