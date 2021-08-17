package com.mycompany.paymentterminal;

public class DumbCardMain {

    public static void main(String[] args) {
        DumbCard StudentCard = new DumbCard(2);
        PaymentTerminal studentCafe = new PaymentTerminal();
        studentCafe.Terminal(1000.0);
        StudentCard.getBalance();
        boolean success2 = studentCafe.eatHearty(StudentCard);
        System.out.println("There was enough money " + success2);
        studentCafe.addMoney(StudentCard, 100);
        boolean success3 = studentCafe.eatHearty(StudentCard);
        System.out.println("There was enough money " + success3);
        StudentCard.getBalance();
        studentCafe.afterSales();

    }
}
