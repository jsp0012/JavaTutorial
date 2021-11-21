public class Main {

    public static void main(String[] args)
    {
        //Birden fazla sınıf içerisinde alt sınıf oluşturma işlemine denilmektedir.
        DatabaseHelper.Crud.delete();
        DatabaseHelper.connection.createConnection();
    }
}
