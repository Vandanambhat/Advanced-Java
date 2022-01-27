package com.xworkz.travel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.travel.dao.TravelDAO;
import com.xworkz.travel.dao.TravelDAOImpl;
import com.xworkz.travel.entity.TravelEntity;

public class TravelAgencyRunner {

	public static void main(String[] args) {
		/*TravelEntity(String emailId, String password, int age, long mobileNo, String place, String country,float cost, LocalDateTime dateOfTravel, int daysOfTravel, String travellingType, int noOfBranches, int noOfTravellers, String createdBy, LocalDateTime createdAt)*/
			TravelEntity entity=new TravelEntity("vandanambhat@gmail.com", "Vandana@123", 24, 9686885440L, "Zurich", "Switzerland", 20000000 , LocalDateTime.now(), 10, "Airplane", 20, 30, "Vandana", LocalDateTime.now());
			TravelEntity entity1=new TravelEntity("Shubha@gmail.com", "Shubha@123", 25, 9901191388L, "Mysore", "Karnataka", 4000, LocalDateTime.now(), 4, "Bus", 5, 10, "Vandana", LocalDateTime.now());
			List<TravelEntity> list=new ArrayList<TravelEntity>();
			list.add(entity);
			list.add(entity1);
			TravelDAO dao=new TravelDAOImpl();
			dao.saveAll(list);
			
	}

}
