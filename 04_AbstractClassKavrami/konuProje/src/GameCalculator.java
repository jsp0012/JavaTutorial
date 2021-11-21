//

public abstract class GameCalculator {

   public abstract void hesapla();// her kullanıcının hesap işlemi farklı olacak.

    // oyun bitti ekranı herkeste ortak gösterileceğinden kimsenin değişiklik yapmasını istemediğimiz durum bu olaracaktır.
    public final void gameOver()
    {
        System.out.println("oyun bitti");
    }
}
