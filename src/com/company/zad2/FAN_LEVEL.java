package com.company.zad2;

public enum FAN_LEVEL {
    SLOW(1),
    MEDIUM(2),
    FAST(3);

    public int  level;
    FAN_LEVEL(int level) {
        this.level = level;
    }
}
