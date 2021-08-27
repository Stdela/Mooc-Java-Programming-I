/*
 */
package com.mycompany.part6_01room;

import java.util.ArrayList;

/**
 *
 * @author delam
 */
public class Main {

    public static void main(String[] args) {
        
        Person person1 = new Person();
        System.out.println(person1.isEmpty());
        
        person1.add(new Person("Joe", 193));
        
        person1.add(new Person("Marcos", 190));
        
        person1.add(new Person("Santiago", 173));
        
        System.out.println(person1.isEmpty());
        System.out.println(person1.getPeople());
        System.out.println(person1.shortest());
        person1.take();
        person1.add(new Person("Mati", 2000));
        System.out.println(person1.getPeople());
    }
}
