package com.lti.core.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.daos.AdminDao;
import com.lti.core.entities.AddBus;
import com.lti.core.entities.Admin;

@Service
public class AdminServicesImpl implements AdminServices{

	@Autowired
	private AdminDao adDao;
	
	@Override
	@Transactional
	public boolean joinNewAdmin(Admin ad) {
		int result = getAdDao().addNewAdmin(ad);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
	}


	
	public AdminDao getAdDao() {
		return adDao;
	}

	public void setAdDao(AdminDao adDao) {
		this.adDao = adDao;
	}

	@Override
	@Transactional
	public boolean joinNewBus(AddBus addB) {
		int result = getAdDao().addNewBus(addB);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
	}



	@Override
	public List<AddBus> findAllBus() {
		List<AddBus> list = getAdDao().readBusDetails();
		return list;
	}


//	@Override
//	public List<Admin> sValidateAdmin(Admin ad) {
//		List<Admin> list = getAdDao().dValidateAdmin(ad);
//		return list;
//	}



	@Override
	public Admin loginAdmin(long phoneNum) {
		Admin ad1 = new Admin();
		ad1=adDao.getAdminByNum(phoneNum);
		return ad1;
	}
	
	@Override
	public List<AddBus> userFindBus(String source, String destination) {
		return adDao.fetchSDDetails(source, destination);
	}



	@Override
	public AddBus getBusDetails(int busId) 
	{
		return adDao.getBusDetails(busId);
	}
}
