package com.lti.core.services;

import java.util.List;

import com.lti.core.entities.AddBus;
import com.lti.core.entities.Admin;

public interface AdminServices {
	public boolean joinNewAdmin(Admin ad);
	public boolean joinNewBus(AddBus addB);
	public List<AddBus> findAllBus();
//	public List<Admin> sValidateAdmin(Admin ad);
	public Admin loginAdmin(long phoneNum);
	public List<AddBus> userFindBus(String source,String destination);
	public AddBus getBusDetails(int busId);
	
}
