package com.company.zad1;

public class Main {

    public static void main(String[] args) {
        REMOTE remote = new REMOTE();
        remote.volume("up");
        remote.tv_on();
        remote.volume("up");

        remote.volume("down");
        remote.volume("up");
        remote.volume("up");

        remote.channel("up");
        remote.tv_on();
        remote.channel("down");

    }
}
