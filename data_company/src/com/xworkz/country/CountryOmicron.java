package com.xworkz.country;

import com.xworkz.country.dao.CountryDAO;
import com.xworkz.country.dao.CountryDAOimpl;
import com.xworkz.country.entity.CountryEntity;

public class CountryOmicron {

	public static void main(String[] args) {
		//id name continent population
		CountryEntity countryEntity1 = new CountryEntity(2,"scotland", "Europe", "54.5 lakhs");
		CountryEntity countryEntity2= new CountryEntity(3,"singapore", "Asia", "56.9 lakhs");
		CountryEntity countryEntity3= new CountryEntity(7,"switzerland", "Europe", "86.4 lakhs");
		
		CountryDAO dao = new CountryDAOimpl();
		dao.create(countryEntity1);
		dao.create(countryEntity2);
		dao.create(countryEntity3);
		

	}

}
