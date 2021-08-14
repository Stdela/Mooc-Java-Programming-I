/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.paymentterminal;

/**
 *
 * @author delam
 */
public class PaymentTerminal {
    private double money;
    private double affordableMeal;
    private double heartyMeal;

    public PaymentTerminal() {
    }

    public PaymentTerminal(double money, double affordableMeal, double heartyMeal) {
        this.money = money;
        this.affordableMeal = 0;
        this.heartyMeal = 0;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getAffordableMeal() {
        return affordableMeal;
    }

    public void setAffordableMeal(double affordableMeal) {
        this.affordableMeal = affordableMeal;
    }

    public double getHeartyMeal() {
        return heartyMeal;
    }

    public void setHeartyMeal(double heartyMeal) {
        this.heartyMeal = heartyMeal;
    }

    @Override
    public String toString() {
        return "PaymentTerminal{" + "Total Money after transactions " + money + ", Affordable Meals sold= " + affordableMeal + ", Hearty meals sold= " + heartyMeal + '}';
    }
    public double Terminal(Double money){
        this.money = money;
        return money;
    }
    public double eatAffordably(Double payment){
        if (payment > 2.50) {
            this.affordableMeal++;
            this.money = money + 2.50;
            System.out.println("Your change is " + (payment-2.50));
            
        } else{
            System.out.println("Funds insuficcient");
        }
        return this.money;
    }
    
    public double eatHearty(Double payment){
        if (payment > 4.30) {
            this.heartyMeal++;
            this.money = money + 4.30;
            System.out.println("Your change is " + (payment-4.30));
            
        } else{
            System.out.println("Funds insuficcient");
        }
        return this.money;
}
    public void afterSales(){
        System.out.println("After transactions, the amount of money is " + this.money + "The amount of Affordable meals sold was" + this.affordableMeal+ "The amount of Hearty meals sold was " + this.heartyMeal);
    }
   public boolean eatAffordably(DumbCard card){
       if (card.getBalance()>2.50) {
           
           card.setBalance(card.getBalance()-2.50);
           System.out.println(card.getBalance());
           this.affordableMeal++;
           return true;
       } else{  
           return false;
       }
       
   }
   public boolean eatHearty(DumbCard card){
       if (card.getBalance()>4.30) {
           card.setBalance(card.getBalance()-4.30);
           System.out.println(card.getBalance());
           this.heartyMeal++;
           return true;
       } else{  
           System.out.println(card.getBalance());
           return false;
       }
       
}
   public void addMoney(DumbCard card, double sum){
      card.setBalance(card.getBalance()+sum);
      this.money= money + sum;
   }
}
