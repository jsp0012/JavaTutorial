package com.company;

public class Main {

    public static void main(String[] args) {

	    KronometreThread thread = new KronometreThread("firstThread");
	    KronometreThread thread2 = new KronometreThread("secondThread");
	    KronometreThread thread3 = new KronometreThread("thirdThread");

	    thread.baslat();
	    thread2.baslat();
	    thread3.baslat();

    }
}
