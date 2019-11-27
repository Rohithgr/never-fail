package com.lti.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import com.lti.core.entities.AddBus;
import com.lti.core.entities.Admin;


@Repository("adDao")
public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public int addNewAdmin(Admin ad) {
		entityManager.persist(ad);
		return 1;
	}

	@Override
	public int addNewBus(AddBus addB) {
		entityManager.persist(addB);
		return 1;
	}

	@Override
	public List<AddBus> readBusDetails() {
		String jpql = "From AddBus";
		TypedQuery<AddBus> tquery = entityManager.createQuery(jpql, AddBus.class);
		List<AddBus> list = tquery.getResultList();
		return list;
	}

	@Override
	public Admin getAdminByNum(long phoneNum) {
		Query qry2 = entityManager.createQuery("select a from Admin a where a.phoneNum= :phoneNum");
		qry2.setParameter("phoneNum", phoneNum);		
		return (Admin)(qry2.getSingleResult());
	}

	@Override
	public List<AddBus> fetchSDDetails(String source, String destination) {
		String jpql = "select b from AddBus b where lower(b.source) =lower(:source) and lower(b.destination)=lower(:destination)";
		TypedQuery<AddBus> tquery = entityManager.createQuery(jpql,AddBus.class);
		tquery.setParameter("source",source);
		tquery.setParameter("destination",destination);
		List<AddBus> list = tquery.getResultList();
		System.out.println("Found records"+list.size());
		return list;
	}
//	@Override
//	public List<Admin> dValidateAdmin(Admin ad) {
//		String jpql = "select phone_num, password from ADMINREG";
//		TypedQuery<Admin> tquery = entityManager.createQuery(jpql, Admin.class);
//		List<Admin> list = tquery.getResultList();
//		return list;
//	}

	@Override
	public AddBus getBusDetails(int busId) 
	{
		AddBus busDetails = entityManager.find(AddBus.class, busId);
		return busDetails;
	}
	
}
