package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static boolean ArmstrongSayilar(int girilensayi)
    {
        boolean result;
        int x=1,basamaksayisi=1,deger=0;
        ArrayList <Integer> basamaklar = new ArrayList<Integer>();

        while (girilensayi/x>9){
            x=x*10;
            basamaksayisi++;
        }
        //System.out.println("basamak sayisi:"+basamaksayisi);
        for(int i = 0; i < String.valueOf(girilensayi).length(); i++) {
            int j = Character.digit(String.valueOf(girilensayi).charAt(i), 10);
            basamaklar.add(j);
        }


        int sonuc=0;
        for (int i = 0; i <basamaklar.size() ; i++) {

            sonuc+= Math.pow(basamaklar.get(i),basamaksayisi);

        }
        if (sonuc==girilensayi)
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
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        int girilensayi =input.nextInt();
        boolean sonuc = ArmstrongSayilar(girilensayi);
        if(sonuc == true)
        {
            System.out.println("Mukemmel sayidir");
        }
        else
        {
            System.out.println("Mukemmel sayi degildir");
        }

    }
}
