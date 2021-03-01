package com.company.zad2;

public class Main {
    public static void main(String[] args) {

        FAN fan = new FAN();
        fan.info();

        FAN fan2 = new FAN(FAN_LEVEL.FAST.level, true, 69.0, "White");
        fan2.info();
    }
}
