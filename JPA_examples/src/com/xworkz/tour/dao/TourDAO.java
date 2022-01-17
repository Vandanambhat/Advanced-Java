package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.TourEntity;

public interface TourDAO {
	public void put(TourEntity entity);

	public void putAll(List<TourEntity> entities);
}
