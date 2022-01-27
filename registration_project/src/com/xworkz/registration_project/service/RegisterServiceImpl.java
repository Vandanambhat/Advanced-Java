package com.xworkz.registration_project.service;

import com.xworkz.registration_project.dao.RegisterDAO;
import com.xworkz.registration_project.entity.RegisterEntity;

public class RegisterServiceImpl implements RegisterService {

	private RegisterDAO registerDAO;

	public RegisterServiceImpl(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}

	@Override
	public boolean validateAndSave(RegisterEntity entity) {

		boolean valid = false;

		if (entity.getUserName() != null && entity.getUserName().length() >= 6 && entity.getUserName().length() <= 25
				&& !(entity.getUserName().isEmpty())) {
			valid = true;
			System.out.println("");
		} else {
			System.out.println(entity.getUserName());
			System.out.println(entity.getUserName().length());
			valid = false;
			System.out.println("");
			return valid;
		}
		if (entity.getEmail() != null && entity.getEmail().contains("@") && entity.getEmail().endsWith(".com")
				|| entity.getEmail().endsWith(".in")
				|| entity.getEmail().endsWith(".org") && !(entity.getEmail().isEmpty())) {
			valid = true;
			System.out.println("");
		} else {
			System.out.println(entity.getEmail());
			valid = false;
			System.out.println("");
			return valid;
		}
		if (entity.getPassword() != null && entity.getPassword().length() >= 8 && entity.getPassword().length() <= 36
				&& !(entity.getPassword().isEmpty())) {
			valid = true;
			System.out.println("");
		} else {
			System.out.println(entity.getPassword());
			System.out.println(entity.getPassword().length());
			valid = false;
			System.out.println("");
			return valid;
		}

		if (String.valueOf(entity.getMobileNo()).length() == 10) {
			valid = true;
			System.out.println("");
		} else {
			System.out.println(entity.getMobileNo());
			valid = false;
			System.out.println("");
			return valid;
		}

		if (entity.getCity() != null && entity.getCity().length() >= 3 && entity.getCity().length() <= 56
				&& !(entity.getCity().isEmpty())) {
			valid = true;
			System.out.println("");
		} else {
			System.out.println(entity.getCity());
			System.out.println(entity.getCity().length());
			valid = false;
			System.out.println("");
			return valid;
		}
		if (entity.getCountry() != null && entity.getCountry().length() >= 3 && entity.getCountry().length() <= 56
				&& !(entity.getCountry().isEmpty())) {
			valid = true;
			System.out.println("");
		} else {
			System.out.println(entity.getCountry());
			System.out.println(entity.getCountry().length());
			valid = false;
			System.out.println("");
			return valid;
		}
		if (valid) {
			registerDAO.save(entity);
		}

		return false;
	}

}
