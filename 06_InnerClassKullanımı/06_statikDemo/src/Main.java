public class Main {

    public static void main(String[] args) {
        // bir metod statik yapıldığı zaman sınıf ismi ile çagrılır.
       ProductManager manager = new ProductManager();
       Product urun = new Product();
       urun.fiyat=50.25;
       urun.adi="Mouse";
       manager.add(urun);

       //sınıfa ait nesne oluşturulmazsa constructor çalışmaz.
       //ProductValidator a = new ProductValidator();


    }
}
