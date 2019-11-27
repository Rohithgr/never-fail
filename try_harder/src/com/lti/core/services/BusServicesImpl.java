package com.lti.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.BusDao;
import com.lti.core.entities.AddBus;

@Service
public class BusServicesImpl implements BusServices {

	@Autowired
	BusDao busDao;
	
	@Override
	public AddBus getBusDetails(int busId) {
		// TODO Auto-generated method stub
		return busDao.getBusDetails(busId);
	}

}
