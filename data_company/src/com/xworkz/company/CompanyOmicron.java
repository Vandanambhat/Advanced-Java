package com.xworkz.company;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyDAOImpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyOmicron {

	public static void main(String[] args) {

//		CompanyEntity companyEntity1 = new CompanyEntity(1, "Cognizant", "Service Based", "IT", "www.Cognizant");
		CompanyEntity companyEntity2 = new CompanyEntity(1, "X-workz", "Training", "IT", "www.xworkz");
		CompanyDAO dao = new CompanyDAOImpl();
//		dao.create(companyEntity1);
		dao.create(companyEntity2);
	}

}
