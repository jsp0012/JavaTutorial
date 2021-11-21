package com.javacourse.project.hibernateAndjpa.DAL;

import java.util.List;
import org.hibernate.Session;
import javax.persistence.EntityManager;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndjpa.Entities.City;
@Repository
public class HibernateCityDal implements ICityDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<City> getAll() { // spting aop kullanılır. Aspect Oriented Programming
		Session session = entityManager.unwrap(Session.class);
		List<City>cities = session.createQuery("from City",City.class).getResultList();
		return cities;
		
	}

	@Override
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void insert(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
		
	}

	@Override
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City citytoDelete = session.get(City.class, city.getId());
		session.delete(citytoDelete);
		
	}

	@Override
	public City getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city; 
	}

}
