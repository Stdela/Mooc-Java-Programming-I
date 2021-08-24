
package com.mycompany.part5_01_oneminute;


public class ClockHand {
private int seconds;
private int hunsec;

    public ClockHand() {
    }

    public ClockHand(int seconds, int hunsec) {
        this.seconds = seconds;
        this.hunsec = hunsec;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHunsec() {
        return hunsec;
    }

    public void setHunsec(int hunsec) {
        this.hunsec = hunsec;
    }

    @Override
    public String toString() {
        return "ClockHand{" + "seconds=" + seconds + ", hunsec=" + hunsec + '}';
    }
public ClockHand createClock(){
    int seconds = 30;
    int hsecs= 98;
    ClockHand reloj = new ClockHand(seconds,hsecs);
    return reloj;
}
public void Adelantar(ClockHand reloj){
    this.hunsec = hunsec + 1;
    if (this.hunsec == 100){
        this.hunsec= 0;
        this.seconds= seconds + 1;
        if (this.seconds==60) {
            this.seconds=0;
        }
    }
}
public void toString(ClockHand reloj){
    System.out.println(seconds + " : " + hunsec);
    if (this.seconds<10) {
        System.out.println("0"+seconds + " : " + hunsec);
        if (this.hunsec<10) {
            System.out.println("0"+seconds + " : " +"0"+ hunsec);
            
        }
        
    } else if (this.hunsec<10) {
        System.out.println(+seconds + " : " +"0"+ hunsec);
    
        
    }
}

}
