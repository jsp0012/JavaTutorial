package com.springDemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	// Constructor injection
	
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
		
		customerDal.add();
		
		


	}

}
