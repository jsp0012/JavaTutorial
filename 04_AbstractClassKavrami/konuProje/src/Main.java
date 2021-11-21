public class Main {

    // oyun da puan hesaplama ornegi gerçeklemek istiyoruz.
    // erkek, kadın ve çocuk için puanlar oluşturulmalı
    // 3ündede hesaplama yapılacağından bu hesaplama sınıf soyut bir metod olarak tanımlanmalıdır.

    public static void main(String[] args)
    {
        //---GameCalculator g1 = new GameCalculator(); bu şekilde tanımalama yapılamaz soyut sınıf oduğundan dolayı.

        GameCalculator mangameCalculator = new ManGameCalculator();
        mangameCalculator.hesapla();

    }
}
