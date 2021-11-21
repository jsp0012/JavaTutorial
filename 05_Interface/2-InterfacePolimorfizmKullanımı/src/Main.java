public class Main {

    public static void main(String[] args) {
         // katman geçişleri interface ile yapılır.
        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.add();

        CustomerManager cm = new CustomerManager(new OracleCustomerDal());
        cm.add();

    }



}
