package com.xworkz.vendor_project.dao;

import com.xworkz.vendor_project.entity.VendorEntity;

public interface VendorDAO {

	public void save(VendorEntity entity);
	
	public boolean findLogin(String loginName,String password);

	public boolean findByEmail(String email);
	
	public void updatePasswordByEmail(String email, String pwd);
}
