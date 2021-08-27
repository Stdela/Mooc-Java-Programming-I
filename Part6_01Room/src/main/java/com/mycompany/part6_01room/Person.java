/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6_01room;

import java.util.ArrayList;

/**
 *
 * @author delam
 */
public class Person {

    private String name;
    private Integer height;
    private ArrayList<Person> people;

    public Person() {
        this.people = new ArrayList<>();
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", height=" + height + '}';
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person aux1 = this.people.get(0);
        for (Person room : this.people) {
            if (aux1.getHeight() > room.getHeight()) {
                aux1 = room;
            }
        }

        return aux1;
    }

    public Person take() {
     Person aux1 = this.shortest();
     this.people.remove(aux1);
     return aux1;
        
    }
}
