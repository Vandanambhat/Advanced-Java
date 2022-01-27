package com.xworkz.vendor_project;

import java.time.LocalDateTime;

import com.xworkz.vendor_project.dao.VendorDAO;
import com.xworkz.vendor_project.dao.VendorDAOImpl;
import com.xworkz.vendor_project.entity.VendorEntity;
import com.xworkz.vendor_project.service.VendorService;
import com.xworkz.vendor_project.service.VendorServiceImpl;

public class VendorRunner {

	public static void main(String[] args) {
		/*
		 * VendorEntity(String name, String email, String loginName, String password,
		 * String address, String gstNo, String createdBy, String createdAt, String
		 * updatedBy, String updatedAt)
		 */
		VendorEntity entity = new VendorEntity("PostgreSQL", "sukanya@gmail.com", "Sukanya R", "kanya@789",
				"PostgreSQL Global Development Group", "18AABCU9603R1ZM", "Vandana", LocalDateTime.now(), "Vandana", LocalDateTime.now());
		VendorDAO dao = new VendorDAOImpl();

		VendorService service = new VendorServiceImpl(dao);
		service.validateAndSave(entity);

	}

}
