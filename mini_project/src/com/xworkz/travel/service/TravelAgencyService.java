package com.xworkz.travel.service;

import java.util.List;

import com.xworkz.travel.entity.TravelEntity;

public interface TravelAgencyService {

	public boolean validateAndSave(List<TravelEntity> entity);

}
