package com.mycompany.part2_02todolist;

import java.util.Scanner;

public class UserInterface {

    private ToDoList todolist;
    private Scanner scanner;

    public UserInterface() {
    }

    public UserInterface(ToDoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Insert command, end breaks , list to print, add to new activity, remove to remove act");
            String activity = scanner.nextLine();
            if (activity.equals("end")) {
                break;
            } else if (activity.equals("list")) {
                this.todolist.print();
            } else if (activity.equals("add")) {
                System.out.println("Enter new Activity");
                String todo = scanner.nextLine();

                this.todolist.add(todo);
            } else if (activity.equals("remove")) {
                System.out.println("Enter ID to remove");
                int aux1 = scanner.nextInt();
                this.todolist.remove(aux1);
            }
        }

    }
}
