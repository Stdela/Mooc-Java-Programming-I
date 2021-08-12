/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part4_01debt;

/**
 *
 * @author delam
 */
public class Debt {

    private double balance;
    private double interestRate;

    public Debt(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void printBalance() {
        System.out.println("Total balance is: ");
        System.out.println(this.balance * this.interestRate);
    }

    public void waitOneYear() {
        
        interestRate = interestRate + 1;
        System.out.println("After one year, interest rate is " + this.interestRate + " %.");
    }

}
