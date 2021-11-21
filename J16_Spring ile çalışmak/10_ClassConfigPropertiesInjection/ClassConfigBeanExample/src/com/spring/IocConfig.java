package com.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration 
@ComponentScan("com.spring")
@PropertySource("classpath:values.properties")
public class IocConfig {
	@Bean
	 public ICustomerDal database()
	 {
		 return new OracleCustomerDal(); // burada oracle veya mysql eklenebilir.
	 }
	 @Bean
	 public ICustomerService service()
	 {
		 return new CustomerManager(database()); 
	 }
		 
}
 