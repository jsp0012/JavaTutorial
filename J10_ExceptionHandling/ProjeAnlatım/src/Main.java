public class Main {

    public static void main(String[] args) {

        try
        {
            int sayilar[] = new int []{1,2,3};
            System.out.println(sayilar[9]);
        }
        catch(Exception e ){
            System.out.println("Hata oluştu");
        }
        finally {
            System.out.println("Finally blok her zaman çalışır");
        }



    }
}
