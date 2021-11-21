package com.company;

public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap bakiyesi: "+ manager.getBakiye());

        manager.paraYatirma(100);


        //para cekme işleminde hata fırlatıldığı için try catch blogu içerisinde yazılmalıdır.
        try
        {
            manager.paraCek(110);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

}
}
