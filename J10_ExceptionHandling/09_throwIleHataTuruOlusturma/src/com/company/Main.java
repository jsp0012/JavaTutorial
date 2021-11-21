package com.company;

public class Main {
    // kendi hata metodumuzu yazmak icin yenı bir sınıf olusturulur.
    public static void main(String[] args) {
        AccountManager manager  = new AccountManager();

        manager.paraYatirma(100);
        //hesaptan 110 lira çekmek istersek hata verecektir.

        try{
            manager.paraCek(110);
        }
        catch (BakiyeYetersizException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
