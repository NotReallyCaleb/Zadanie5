package com.company.zad3;
import java.util.Scanner;

public class MAIN {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        ACCOUNT users[] = new ACCOUNT[99999];
        for(int i=0; i< users.length;i++) {
            users[i] = new ACCOUNT();
        }

        while (true) {
            System.out.println("Podaj ID konta (Wpisz -1 by wyjsc)");
            int x = scanner.nextInt();
            if (x == -1) {
                break;
            }

            int choice = 0;
            while (choice != 4) {
                System.out.println("1.Sprawdz stan konta\n2.Wypłać środki\n3.Wpłać środki\n4.Wyjdź");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        users[x].INFO();
                        break;
                    case 2:
                        users[x].WITHDRAW();
                        break;
                    case 3:
                        users[x].DEPOSIT();
                        break;
                    case 4:
                        System.out.println("Zegnaj");
                        break;
                }

            }
        }
    }
}
