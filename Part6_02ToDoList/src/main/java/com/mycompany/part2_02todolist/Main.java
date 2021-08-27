/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part2_02todolist;

import java.util.Scanner;

/**
 *
 * @author delam
 */
public class Main {
public static void main(String[]args){
ToDoList list = new ToDoList();
Scanner scanner = new Scanner(System.in);
UserInterface user = new UserInterface(list,scanner);
user.start();
}    
}
