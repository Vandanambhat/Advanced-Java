package com.xworkz.tour;

import com.xworkz.tour.dao.TourDAO;
import com.xworkz.tour.dao.TourDAOImpl;
import com.xworkz.tour.entity.TourEntity;

public class TourRunner {

	public static void main(String[] args) {

		TourEntity entity=new TourEntity(1, "Banglore", 3000, "Traffic", 10, "Winter");
		TourDAO dao=new TourDAOImpl();
		dao.put(entity);
	}

}
