/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part5_01books;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author delam
 */
public class BooksEx {

    public static void main(String[] args) {
        ArrayList<Books> booksCompared = new ArrayList<>();
        Scanner lectura = new Scanner(System.in);
        while (true) {
            System.out.println("Insert book's name. Empty will stop");
            String name = lectura.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Insert book's publishing date");
            String year = lectura.nextLine();
            Books libros = new Books(name, year);
            if (!(booksCompared.contains(libros))) {
                booksCompared.add(libros);
            } else {
                System.out.println("Book has already been registered");
            }

        }
    }
}
