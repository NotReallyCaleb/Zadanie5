package com.company.zad4;

public class MAIN {
    public static int attack(int damage, int armor) {
        if (damage > armor) {
            return damage - armor;
        } else {
            return armor - damage;
        }
    }

    public static void main(String[] args) {

        PLAYER pl = new PLAYER();
        pl.CHOOSE_EQ();

        ENEMY en = new ENEMY();
        en.CHOOSE_EQ();

        System.out.println(pl.DAMAGE + " " + pl.ARMOR + " " + en.DAMAGE + " " + en.ARMOR + " " + attack(pl.DAMAGE, en.ARMOR));

        while (true) {
            en.HEALTH -= attack(pl.DAMAGE, en.ARMOR);
            System.out.println("Your enemy takes: " + attack(pl.DAMAGE, en.ARMOR) + " Damage and Armor; Your enemy has: " + en.HEALTH + "HP left");
            if (en.HEALTH <= 1) {
                System.out.println("You've Won!");
                break;
            }
            pl.HEALTH -= attack(en.DAMAGE, pl.ARMOR);
            System.out.println("Enemy hits you for: " + attack(en.DAMAGE, pl.ARMOR) + " Damage and Armor; You have: " + pl.HEALTH + "HP left");
            if (pl.HEALTH <= 1) {
                System.out.println("You've Lost! \n git gud");
                break;
            }
        }


    }
}