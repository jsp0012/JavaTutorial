package com.company;

public class Main {

    public static void main(String[] args) {
	Product urun = new Product();
	urun.name="Laptop";
	urun.id=1;
	urun.aciklama="Ozellikleri";
	urun.price=2480;
	urun.stokadedi=100;

	ProductManager p1 = new ProductManager();
	p1.add(urun);
    }
}
