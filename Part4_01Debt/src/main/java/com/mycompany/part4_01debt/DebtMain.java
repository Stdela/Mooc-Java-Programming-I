package com.mycompany.part4_01debt;

/**
 *
 * @author delam
 */
public class DebtMain {
    public static void main(String[]args){
        Debt debt1 = new Debt(1200, 1.01);
        debt1.printBalance();
        debt1.waitOneYear();
        debt1.printBalance();
        
        
    }
}
