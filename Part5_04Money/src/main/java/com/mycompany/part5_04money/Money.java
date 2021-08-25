/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part5_04money;

/**
 *
 * @author delam
 */
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition, Money cents){
        if ((this.cents + cents.cents)> 99) {
     Money newMoney = new Money((this.euros+ addition.euros) + 1, (this.cents + cents.cents) - 100 );      
     return newMoney;
        } else{
             Money newMoney = new Money((this.euros+ addition.euros), (this.cents + cents.cents));
             return newMoney;
        }
   
     
        
     
    
}
    public boolean lessThan(Money comp){
        if (comp.euros> this.euros) {
            return true;
        } else{ 
            return false;
        
            
        
    }
        
}
    public Money minus(Money number, Money cents){
        if (number.euros> this.euros) {
        Money newMoney = new Money(0,0);
            return newMoney;
        }
        if (this.cents == 0 && number.cents>0) {
        Money newMoney = new Money((this.euros - 1 - number.euros)  ,(this.cents + 100 -cents.cents) );    
        return newMoney;
        }   else{
            Money newMoney = new Money((this.euros - number.euros),(this.cents-cents.cents) );
            return newMoney;
        }
        
        
    }
}


