package com.company;

import java.util.ArrayList;
    // Repositoy Design Pattern
    //genellikle veri tabanı islemleri icin kullanılır.
public class Main {

    public static void main(String[] args) {

        ArrayList <String> sehirler = new ArrayList<String>();
    	//sehirler arraylist i string tipinde çalışsan bir generic classdır.
        // tip guvenli calısmak icin kullanılır.
        sehirler.add("Ankara");
        sehirler.add("Ankara1");
        sehirler.add("Ankara2");

    }
}
