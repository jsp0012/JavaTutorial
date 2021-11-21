package com.company;

public class Product {
    //sag tıklayıp refactor->encapculation field seklinde yaparsak tum teodları otomatik hale getiririz.

    private int _id;
    private String _name;
    private String _aciklama;
    private double _price;
    private int _stokadedi;

    //getter blok
    public int getId()
    {
        return _id; // id okunabilir ama yazamaz.(private oldugu için)
    }

    //setter blok
    public void setId(int id)
    {
        _id = id; // set metodu ile yazma islemi yapabilmekteyiz.
    }

    //bu islemler tum private değiskenlere yapılabilmektedir.




}
