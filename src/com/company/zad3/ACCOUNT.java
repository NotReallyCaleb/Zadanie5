package com.company.zad3;
import java.util.Scanner;

public class ACCOUNT {
    double balance = 100.0;
    Scanner scanner = new Scanner(System.in);


    public void DEPOSIT(){
        System.out.print("Ile chcesz wpłacic?");
        double amount = scanner.nextDouble();
        if (amount < 0 ){
            System.out.println("Próbujesz wpłacić minusową liczbę pieniędzy");
        }
        else{
            this.balance += amount;
        }
    }
    public void WITHDRAW(){
        System.out.print("Ile chcesz wypłacic?");
        double amount = scanner.nextDouble();
        if (amount < 0 ) {
            System.out.println("Próbujesz wpyłacić minusową liczbę pieniędzy");
        }
        else {
            if (amount > this.balance) {
                System.out.println("Nie masz tylu środków na koncie");
            } else {
                this.balance -= amount;
            }
        }
    }
    public void INFO(){
        System.out.println("Twój stan konta: "+ this.balance);
    }
}

