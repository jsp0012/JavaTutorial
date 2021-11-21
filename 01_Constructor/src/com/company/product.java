package com.company;

public class product {

    String ad;
    int fiyat;

    // Counstructor overloading meselesi
    public product()
    {

    }
    public product(String name, int fiyat)
    {
        this.ad = name;
        this.fiyat = fiyat;
        System.out.println("urun2: "+ad+" fiyatı: "+fiyat);
    }

}
