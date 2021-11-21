import Matematik.DortIslem;
import Matematik.Trigonometri;

public class Main {

    public static void main(String[] args)
    {
        DortIslem islem1= new DortIslem();
        int sonuc=islem1.topla(2,3);
        System.out.println("2 ve 3 ün toplamı: "+sonuc);

        Trigonometri islem2 = new Trigonometri();

        double sonuc2 = islem2.sinus(30);
        System.out.println("30 derecenin sinüs değeri (Radyan): "+sonuc2);

    }
}
