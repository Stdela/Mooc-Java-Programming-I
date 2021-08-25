package com.mycompany.part5_04money;

import java.util.Scanner;
import java.util.ArrayList;

public class MoneyEx {

    public static void main(String[]args) {
        Money money1 = new Money(10,0);
         Money money2 = new Money(13,50);
         System.out.println(money1.plus(money2, money2));
        System.out.println( money1.lessThan(money2));
         System.out.println(money1.minus(money2, money2));
         
         
         
        
    }
    
        
    
    
}
