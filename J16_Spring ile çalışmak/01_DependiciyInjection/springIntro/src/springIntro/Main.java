package springIntro;

public class Main {
	
	
	//dependicy Injection islemi
	

	public static void main(String[] args) {
		CustomerManager manager = new CustomerManager(new MysqlCustomerDal());
		manager.add();
		
		CustomerManager manager2 = new CustomerManager(new OracleCustomerDal());
		manager2.add();


	}

}
