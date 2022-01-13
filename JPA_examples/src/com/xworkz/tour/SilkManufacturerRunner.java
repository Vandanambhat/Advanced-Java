package com.xworkz.tour;

import com.xworkz.tour.dao.SilkManufacturerDAO;
import com.xworkz.tour.dao.SilkManufacturerDAOImpl;
import com.xworkz.tour.entity.SilkManufacturerEntity;

public class SilkManufacturerRunner {

	public static void main(String[] args) {
		SilkManufacturerEntity entity = new SilkManufacturerEntity(2, "Karnataka", 50.6f, "elastic", "Mysore silk",
				3400.56d, false);

		SilkManufacturerDAO dao = new SilkManufacturerDAOImpl();
		dao.put(entity);
	}

}
