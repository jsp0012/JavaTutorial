package com.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan("com.spring")
public class IocConfig {
	 @Bean
 public ICustomerDal database()
 {
	
	 return new OracleCustomerDal(); // burada oracle veya mysql eklenebilir.
 }
	 
}
 