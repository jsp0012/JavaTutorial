import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> sayilist = new ArrayList<Integer>();
        // arraylist e eleman ekleme işlemi
        //---------------------------------
        for (int i = 0; i < 5 ; i++) {
            sayilist.add(i);
        }
        //---------------------------------

        //arraylist boyutu ögrenmek için;
        //-------------------------------
        System.out.println("sayilist arraylistinin boyutu: "+sayilist.size());
        //-------------------------------

        // obje türünde arraylist olabilir.
        //-------------------------------
        ArrayList karisik = new ArrayList();
        karisik.add(01);
        karisik.add("adana");
        //-------------------------------


        // arraylist ilgili elemana erişmek için;
        //-------------------------------
        System.out.println("karisik listenin 0. elemanı: " +karisik.get(0));
        System.out.println("karisik listenin 1. elemanı: " +karisik.get(1));
        //-------------------------------


        // arraylist ilgili indexteki elemanı değiştirmek için;
        //-------------------------------
        System.out.println("karisik listesinin ilk elemanı degisti eleman degeri: "+ karisik.set(0,25));// index no, güncellenecek değer
        //-------------------------------

        //arraylistten eleman silmek için;
        //------------------------------- sayilist.remove(index);
        sayilist.remove(0);
        //-------------------------------

        //arraylistten tum elemanlari siler
        //-------------------------------
        sayilist.clear();
        //-------------------------------









    }

}
