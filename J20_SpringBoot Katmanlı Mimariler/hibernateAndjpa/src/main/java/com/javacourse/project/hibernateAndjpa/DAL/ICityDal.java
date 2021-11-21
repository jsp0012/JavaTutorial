package com.javacourse.project.hibernateAndjpa.DAL;
import java.util.List;

import com.javacourse.project.hibernateAndjpa.Entities.*;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void insert(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);

}
