package com.company;

public class AccountManager {

    private double bakiye;

    public void paraYatirma(double yatacaktutar)
    {
        bakiye+= yatacaktutar;
    }

    public void paraCek(double cekilecektutar) throws Exception {
        if(bakiye>= cekilecektutar)
        {
            bakiye -= cekilecektutar;
        }
        else
        {
            throw new Exception("Bakiye yetersiz");
        }

    }

    public double getBakiye()
    {
        return bakiye;
    }
}
