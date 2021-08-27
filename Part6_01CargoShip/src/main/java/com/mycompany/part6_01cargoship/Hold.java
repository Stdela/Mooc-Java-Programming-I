/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6_01cargoship;

import java.util.ArrayList;

/**
 *
 * @author delam
 */
public class Hold {

    private ArrayList<Suitcase> cargo;
    private int ShipMaxWeight;

    public Hold() {
    }

    public Hold(int ShipMaxWeight) {
        this.cargo = new ArrayList<>();
        this.ShipMaxWeight = ShipMaxWeight;
    }

    public ArrayList<Suitcase> getCargo() {
        return cargo;
    }

    public void setCargo(ArrayList<Suitcase> cargo) {
        this.cargo = cargo;
    }

    public int getShipMaxWeight() {
        return ShipMaxWeight;
    }

    public void setShipMaxWeight(int ShipMaxWeight) {
        this.ShipMaxWeight = ShipMaxWeight;
    }

    @Override
    public String toString() {
        return this.cargo.size() + " suitcases ( " + this.totalCargo() + " kg)";
    }

    public void addCargo(Suitcase items) {
        int aux1 = 0;
        aux1 += items.totalWeight();
        this.ShipMaxWeight = this.ShipMaxWeight - aux1;
        if (this.ShipMaxWeight >= 0) {
            this.cargo.add(items);
        } else {
            System.out.println("Error, ship is already full, can't add suitcase");
        }
    }

    public int totalCargo() {
        int aux1 = 0;
        for (Suitcase valijas : this.cargo) {
            aux1 += valijas.totalWeight();

        }
        return aux1;
    }

    public void printItems() {
        for (Suitcase suitcase : this.cargo) {
            suitcase.printItems1();
        }

    }
}
