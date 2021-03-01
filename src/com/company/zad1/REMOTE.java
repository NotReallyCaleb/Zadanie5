package com.company.zad1;

public class REMOTE {
    TV tv = new TV();
    public void tv_on() {
        if (tv.on == false) {
            tv.on = true;
            System.out.println("TV TURNED ON");
        }
        else {
            tv.on = false;
            System.out.println("TV TURNED OFF");
        }
    }
    public void channel(String up_or_down) {
        if (tv.check_tv_on() == true) {
            if ((up_or_down == "up") && (tv.channel < 20) && (tv.channel > 1)){
                tv.channel++;
            }
            else if ((up_or_down == "down") && (tv.channel > 1) && (tv.channel < 10) ){
                tv.channel--;
            }
            System.out.println("Kanał ustawiony na "+ tv.channel);
        }
    }
    public void volume(String up_or_down) {
        if (tv.check_tv_on() == true) {
            if ((up_or_down == "up") && (tv.volume < 10)) {
                tv.volume++;
            }
            else if ((up_or_down == "down") && (tv.volume > 1)) {
                tv.volume--;
            }
            System.out.println("VOLUME ON: " + tv.volume);
        }
    }
}
