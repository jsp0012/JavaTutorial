package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	// Constructor injection
	
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		customerService.add();
		
		


	}

}
