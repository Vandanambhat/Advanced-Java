package com.xworkz.registration_project;

import com.xworkz.registration_project.dao.RegisterDAO;
import com.xworkz.registration_project.dao.RegisterDAOImpl;
import com.xworkz.registration_project.entity.RegisterEntity;
import com.xworkz.registration_project.service.RegisterService;
import com.xworkz.registration_project.service.RegisterServiceImpl;

public class RegisterRunner {

	public static void main(String[] args) {
		RegisterEntity entity = new RegisterEntity("Vandana", "Vandanambhat@gmail.com", "vandana@123", "Mysore", "India",
				9886885440L, true);
		RegisterEntity entity1 = new RegisterEntity("Manasa", "Manasamhegde@gmail.com", "Manasa@123", "Bengaluru", "India",
				8310656573L, true);
		RegisterDAO dao = new RegisterDAOImpl();


		RegisterService service = new RegisterServiceImpl(dao);
		service.validateAndSave(entity);
		service.validateAndSave(entity1);
	}
}
