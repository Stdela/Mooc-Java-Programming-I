package com.mycompany.part05_04comparingapartments;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        Apartments ap1 = new Apartments(1, 16, 5500);
        Apartments ap2 = new Apartments(2, 38, 4200);
        Apartments ap3 = new Apartments(3, 78, 2500);
        System.out.println(ap1.largerThan(ap2));
        System.out.println(ap3.largerThan(ap2));
        System.out.println(ap1.priceDifference(ap2));
        System.out.println(ap3.priceDifference(ap2));
        /// missing the more expensive method, which just compares ap prices///
    }
    
}
