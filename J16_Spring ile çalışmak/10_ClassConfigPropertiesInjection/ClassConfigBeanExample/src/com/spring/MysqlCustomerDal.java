package com.spring;

import  org.springframework.beans.factory.annotation.Value;

public class MysqlCustomerDal implements ICustomerDal{
	@Value("${database.ConnectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add()
	{
		System.out.println("Connection String: "+this.connectionString);
		System.out.println("Mysql veri tabanina eklendi");
	}

}
