public class ProductManager {

     public void add(Product urun)
     { // bir metod statik yapıldığı zaman sınıf ismi ile çagrılır.
         //statik blok oluşturmak istenilebilir.

         if(ProductValidator.isValid(urun))
         {
             System.out.println("urun eklendi..");
         }
         else
             System.out.println("urun eklenemedi..");

     }
}
