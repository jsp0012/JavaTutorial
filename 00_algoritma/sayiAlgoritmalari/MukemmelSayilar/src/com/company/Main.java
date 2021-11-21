package com.company;


import java.util.Scanner;

public class Main {

    public static boolean mukemmelsayilar(int girilensayi)
    {
        boolean result;
        int toplam=0;

        for (int i = 1; i < girilensayi ; i++) {
            if(girilensayi % i ==0)
            {
                toplam+=i;
            }
        }

        if(toplam==girilensayi)
        {
            result=true;
        }

        else
        {
            result=false;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println("sayi giriniz: ");
        Scanner sc = new Scanner(System.in);
        int girilensayi= sc.nextInt();

        boolean sonuc = mukemmelsayilar(girilensayi);

        if (sonuc == true)
        {
            System.out.println("Mukemmel sayidir");
        }
        else
        {
            System.out.println("Mukemmel sayi degildir");
        }

    }
}
