package com.javacourse.project.hibernateAndjpa.BL;

import java.util.List;

import com.javacourse.project.hibernateAndjpa.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void insert(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
