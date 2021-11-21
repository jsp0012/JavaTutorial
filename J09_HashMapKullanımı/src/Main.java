import java.util.HashMap;

public class Main {

    public static void main(String[] args)
    {
        //<Key,value>
        HashMap<String,String> sozluk = new HashMap<String, String>();

        // hashMap' e eleman ekleme işlemi
        sozluk.put("Book","Kitap");
        sozluk.put("Table","Masa");
        sozluk.put("Computer","Bilgisayar");

       //ilgili elemanlara erişmek için
        for (String item: sozluk.keySet()) {
            System.out.println("Eleman:->"+item+"Değeri:->"+sozluk.get(item));
        }

        //ilgili indexteki elemana erişme işlemi

        System.out.println(sozluk.get("Table")); // cıktı olarak masa yazacak. Buyuk kucuk hard duyarlıdır.

        // sözlükten eleman silme işlemi için

        sozluk.remove("Table");

        //hashmap boyunu ögrenmek icin
        sozluk.size();

        //hasmap i temizlemek için
        sozluk.clear();




    }
}
