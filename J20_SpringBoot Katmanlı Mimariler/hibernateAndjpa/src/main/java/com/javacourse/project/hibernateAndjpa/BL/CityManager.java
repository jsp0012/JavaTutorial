 package com.javacourse.project.hibernateAndjpa.BL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndjpa.DAL.ICityDal;
import com.javacourse.project.hibernateAndjpa.Entities.City;

@Service
public class CityManager implements ICityService {
	
	// dal katmanına erişim saglamalıyız. 
	//Interface ler üzerinden erişim sağlanmalıdır ki bağımlı olmasın
	
	private ICityDal cityDal; 

	@Autowired
	public CityManager(ICityDal cityDal) {
		
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Override
	public void add(City city) {
		// iş kuralları burada yazılmalıdır. City varsa ekleme yapılmamalı gibi
		this.cityDal.add(city);
		
	}

	@Override
	public void insert(City city) {
		this.cityDal.add(city);
		
	}

	@Override
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}

	@Override
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

}
