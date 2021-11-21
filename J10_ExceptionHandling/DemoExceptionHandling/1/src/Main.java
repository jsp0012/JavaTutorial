public class Main {

    public static void main(String[] args) {

        try
        {
            int sayilar[] = new int []{1,2,3};
            System.out.println(sayilar[9]);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("dizi 3 elemanlı sen 9. elemanı istiyorsum!!!");
        }
        catch(Exception e ){
            System.out.println("Hata oluştu");
        }

        finally {
            System.out.println("Finally blok her zaman çalışır");
        }



    }
}
