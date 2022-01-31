package com.xworkz.vendor_project.service;

import com.xworkz.vendor_project.entity.VendorEntity;

public interface VendorService {

	public boolean validateAndSave(VendorEntity entity);
	
	public boolean validateAndLogin(String loginName,String password);
	
	public void validateAndChangePassword(String email, String newPassword);
	
}
