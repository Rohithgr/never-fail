package com.lti.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.core.entities.AddBus;

@Repository("busDao")
public class BusDaoImpl implements BusDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public AddBus getBusDetails(int busId) {
		AddBus busD = entityManager.find(AddBus.class, busId);
		return busD;
	}
	
}
