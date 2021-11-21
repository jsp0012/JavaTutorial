package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("sayi giriniz");
        Scanner input = new Scanner(System.in);
        boolean check=true;
        int girilensayi = input.nextInt();
        for (int i = 2; i < girilensayi; i++) {
            if ((girilensayi % i) == 0) {
                System.out.println("asal degildir");
                check=false;
                break;
            }
        }

        if(check == true)
        {
            System.out.println("asaldır");

        }

    }
}
