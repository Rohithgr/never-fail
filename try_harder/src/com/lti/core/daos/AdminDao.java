package com.lti.core.daos;

import java.util.List;

import com.lti.core.entities.AddBus;
import com.lti.core.entities.Admin;

public interface AdminDao {
	public int addNewAdmin(Admin ad);
	public int addNewBus(AddBus addB);
	public List<AddBus> readBusDetails();
//	public List<Admin> dValidateAdmin(Admin ad);
	public Admin getAdminByNum(long phoneNum);
	public List<AddBus> fetchSDDetails(String source, String destination);
	
	public AddBus getBusDetails(int busId);
	
}
