package com.company;

public class Main {

    public static void main(String[] args) {
	DortIslem islem= new DortIslem();
	double sonuc = islem.topla(2,3);
	double sonuc2=islem.topla(2,3,4);
    System.out.println("toplam1: "+sonuc);
    System.out.println("toplam2: "+sonuc2);
    }
}
