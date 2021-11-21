package com.hibernateDemo;

import javax.persistence.*;

@Entity // veri tabanı sınıfı oldugu belirtilir.
@Table(name ="city") // hangi tablodan veriler gelecek o belirtiliyor.

public class City {
	@Id
	@Column (name="ID") // veri tabanındaki Id sutunu ıd degiskenine atanıyor.
	private int Id;
	@Column (name="name") 
	private String name;
	@Column (name="countryCode") 
	private String countryCode;
	@Column (name="district") 
	private String district;
	@Column (name="population") 
	private String population;
		
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	
	

}
