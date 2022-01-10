package com.xworkz.country;

import com.xworkz.country.dao.CountryDAO;
import com.xworkz.country.dao.CountryDAOimpl;
import com.xworkz.country.entity.CountryEntity;

public class CountryOmicron {

	public static void main(String[] args) {

		CountryEntity countryEntity1 = new CountryEntity(1,"scotland", "Europe", "54.5 lakhs");//name continent population
		CountryDAO dao = new CountryDAOimpl();
		dao.create(countryEntity1);

	}

}
