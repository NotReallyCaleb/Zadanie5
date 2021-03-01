package com.company.zad4;
import java.util.Scanner;

public class PLAYER {
    Scanner scanner = new Scanner(System.in);
    int HEALTH;
    int DAMAGE;
    int ARMOR;

    PLAYER(){
        this.HEALTH = HEALTH;
        this.DAMAGE = DAMAGE;
        this.ARMOR = ARMOR;
    }
    public void CHOOSE_EQ(){
        System.out.println("Choose your class\n1. 'Axeman', 105HP, 15DMG, 4ARM\n2. 'Brute', 160HP, 7DMG, 15ARM\n3. 'Sorcerer', 50HP, 20DMG, 0ARM");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                HEALTH = 105;
                DAMAGE = 15;
                ARMOR = 4;
                break;
            case 2:
                HEALTH = 160;
                DAMAGE = 7;
                ARMOR = 15;
                break;
            case 3:
                HEALTH = 50;
                DAMAGE = 20;
                ARMOR = 0;
                break;
        }

    }
}
