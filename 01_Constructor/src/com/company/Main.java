package com.company;

public class Main {

    public static void main(String[] args) {
	product u1 = new product();
	u1.ad="bilgisayar";
	u1.fiyat=5000;
		System.out.println("urun1: "+u1.ad+" fiyatı: "+u1.fiyat);

	product p2 = new product("telefon",2300);

    }
}
