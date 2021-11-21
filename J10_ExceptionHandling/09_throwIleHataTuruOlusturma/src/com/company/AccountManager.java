package com.company;
public class AccountManager {

    private double bakiye;

    public void paraYatirma(double yatacaktutar)
    {
        bakiye+= yatacaktutar;
    }

    public void paraCek(double cekilecektutar) throws BakiyeYetersizException {
        if(bakiye>= cekilecektutar)
        {
            bakiye -= cekilecektutar;
        }
        else
        {
            throw new BakiyeYetersizException("Bakiye yetersiz");
        }

    }

    public double getBakiye()
    {
        return bakiye;
    }
}
