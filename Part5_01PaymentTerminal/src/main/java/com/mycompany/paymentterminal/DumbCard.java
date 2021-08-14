package com.mycompany.paymentterminal;

public class DumbCard {

    private double balance;

    public DumbCard() {
    }

    public DumbCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "DumbCard{" + "balance=" + balance + '}';
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void AddMoney(double addMoney) {
        this.balance = balance + addMoney;

    }

    public boolean takeMoney(double takeMoney) {

        if (takeMoney > this.balance) {
            System.out.println("Funds insuficcient, try adding money and trying again " + this.balance);
            return false;
        } else {
            this.balance = balance - takeMoney;
            System.out.println("New Balance " + this.balance);
            return true;
        }
    }
}
