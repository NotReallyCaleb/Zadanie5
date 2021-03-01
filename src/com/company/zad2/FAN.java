package com.company.zad2;

public class FAN {
    int speed;
    boolean on;
    double radius;
    String color;

    public FAN(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    FAN(){
        this.speed = FAN_LEVEL.SLOW.level;
        this.on = false;
        this.radius = 20;
        this.color = "Black";
    }
    public void info(){
        System.out.println("FAN SPEED: " + this.speed + "\nON/OFF: "+this.on+"\nFAN RADIUS: "+this.radius+"\nCOLOUR: "+this.color);
    }

}