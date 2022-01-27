package com.xworkz.registration_project.service;

import com.xworkz.registration_project.entity.RegisterEntity;

public interface RegisterService {

	public boolean validateAndSave(RegisterEntity entity);
}
