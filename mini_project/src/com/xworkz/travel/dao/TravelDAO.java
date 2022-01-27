package com.xworkz.travel.dao;

import java.util.List;

import com.xworkz.travel.entity.TravelEntity;

public interface TravelDAO {

	public void saveAll(List<TravelEntity> entity);
}
