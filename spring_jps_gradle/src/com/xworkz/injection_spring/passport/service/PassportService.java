package com.xworkz.injection_spring.passport.service;

import com.xworkz.injection_spring.passport.entity.PassportEntity;

public interface PassportService {

	public boolean validateAndSave(PassportEntity entity);

}
