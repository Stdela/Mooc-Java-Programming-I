package com.mycompany.part6_01cargoship;

import java.util.Scanner;
import java.util.ArrayList;

public class CargoShip {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Item book = new Item("The Lord of the Rings", 2);
        Item phone = new Item("Samsung", 1);
        Item brick = new Item("Brick", 4);
        Suitcase valijaJohn = new Suitcase(10);
        valijaJohn.add(book);
        valijaJohn.add(phone);

        Suitcase valijaMarta = new Suitcase(10);
        valijaMarta.add(brick);
        Hold ship1 = new Hold(1000);
        ship1.addCargo(valijaMarta);
        ship1.addCargo(valijaJohn);
        System.out.println(ship1);
        ship1.printItems();
    }

}
