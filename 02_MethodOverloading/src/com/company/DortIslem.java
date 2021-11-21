package com.company;

public class DortIslem {

    // bu iki metod isimleri aynı olmasına rağmen birbirinden farkı sayıda parametre almaktadır.
    //Bu işleme method overloading denilir.

    public double topla(double s1, double s2)
    {
        return s1+s2;
    }

    public double topla(double s1, double s2,double s3)
    {
        return s1+s2+s3;
    }
}
