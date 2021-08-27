/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6_01stacks;

/**
 *
 * @author delam
 */
public class StackEx {
   public static void main(String[]args){
 Stack s = new Stack();
System.out.println(s.isEmpty());
System.out.println(s.values());
s.add("1");
s.add("2");
s.add("3");
s.add("4");
s.add("5");
System.out.println(s.isEmpty());
System.out.println(s.values());
s.take();
       System.out.println(s.values());
   }
    
}
