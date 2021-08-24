/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part5_01_oneminute;

/**
 *
 * @author delam
 */
public class exClockHand {
    public static void main(String[]args){
        ClockHand clock = new ClockHand(30,95);
        clock.createClock();
        clock.Adelantar(clock);
        clock.Adelantar(clock);
        clock.Adelantar(clock);
        clock.Adelantar(clock);
        clock.Adelantar(clock);
        clock.Adelantar(clock);
        clock.toString(clock);
    }
}
