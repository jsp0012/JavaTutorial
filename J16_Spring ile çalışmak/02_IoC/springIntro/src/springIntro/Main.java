package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	//Inversion of Control islemi
	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// applicationContext.xml dosyasinda database isimli bean çağrılmaktadır.
		// İlgili bean hangi özelliği çağırırsa o sınıf çalışmaktadır.
		CustomerManager manager = 
				new CustomerManager(context.getBean("database",ICustomerDal.class));
		
		manager.add();
		
		


	}

}
