package com.xworkz.vendor_project.service;

import com.xworkz.vendor_project.dao.VendorDAO;
import com.xworkz.vendor_project.entity.VendorEntity;

public class VendorServiceImpl implements VendorService {

	private VendorDAO vendorDAO;

	public VendorServiceImpl(VendorDAO vendorDAO) {
		super();
		this.vendorDAO = vendorDAO;
	}

	@Override
	public boolean validateAndSave(VendorEntity entity) {
		boolean valid = false;

		if (entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() >= 5
				&& entity.getName().length() <= 30) {
			System.out.println("The name is valid");
			valid = true;
		} else {
			valid = false;
			System.out.println("Not a valid name");
			System.out.println(entity.getName());
			System.out.println(entity.getName().length());
			return valid;
		}

		if (entity.getCreatedBy() != null && !(entity.getCreatedBy().isEmpty()) && entity.getCreatedBy().length() >= 5
				&& entity.getCreatedBy().length() <= 30) {
			valid = true;
			System.out.println("Created by is valid name");
		} else {
			valid = false;
			System.out.println(entity.getCreatedBy());
			System.out.println(entity.getCreatedBy().length());
			return valid;
		}

		if (entity.getEmail() != null && entity.getEmail().contains("@") && entity.getEmail().endsWith(".com")
				|| entity.getEmail().endsWith(".in")
				|| entity.getEmail().endsWith(".org") && !(entity.getEmail().isEmpty())) {
			valid = true;
			System.out.println("Valid Email");
		} else {
			System.out.println(entity.getEmail());
			valid = false;
			System.out.println("Not a valid email");
			return valid;
		}

		if (entity.getLoginName() != null && !(entity.getLoginName().isEmpty()) && entity.getLoginName().length() >= 8
				&& entity.getLoginName().length() <= 12) {
			valid = true;
			System.out.println("Given a Valid login name");
		} else {
			System.out.println(entity.getLoginName());
			valid = false;
			System.out.println("Not a valid login name");
			return valid;
		}

		if (entity.getAddress() != null && !(entity.getAddress().isEmpty()) && entity.getAddress().length() >= 30
				&& entity.getAddress().length() <= 100) {
			valid = true;
			System.out.println("Given address is valid");
		} else {
			valid = false;
			System.out.println("Not a valid address");
			return valid;
		}

		if (entity.getGstNo() != null && !(entity.getGstNo().isEmpty()) && entity.getGstNo().length() >= 0
				&& entity.getGstNo().length() <= 15) {
			valid = true;
			System.out.println("Valid GST number");
		} else {
			valid = false;
			System.out.println("Not a valid GST number");
			return valid;
		}
		if (valid) {
			vendorDAO.save(entity);
		}
		return false;
	}

}
