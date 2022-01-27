package com.xworkz.travel.service;

import java.util.List;
import com.xworkz.travel.dao.TravelDAO;
import com.xworkz.travel.entity.TravelEntity;

public class TravelAgencyServiceImpl implements TravelAgencyService {

	private TravelDAO daoSTravelDAO;

	public TravelAgencyServiceImpl(TravelDAO daoSTravelDAO) {
		super();
		this.daoSTravelDAO = daoSTravelDAO;
	}

	@Override
	public boolean validateAndSave(List<TravelEntity> entity) {
		boolean valid = true;
		if (((TravelEntity) entity).getCountry() != null && ((TravelEntity) entity).getCountry().length() >= 3
				&& ((TravelEntity) entity).getCreatedBy() != null
				&& ((TravelEntity) entity).getCreatedBy().length() >= 3
				&& ((TravelEntity) entity).getEmailId().length() >= 3
				&& ((TravelEntity) entity).getEmailId().length() >= 3 && ((TravelEntity) entity).getAge() >= 0
				&& ((TravelEntity) entity).getAge() <= 500000 && ((TravelEntity) entity).getCost() >= 0
				&& ((TravelEntity) entity).getCost() <= 500000 && ((TravelEntity) entity).getDaysOfTravel() >= 0
				&& ((TravelEntity) entity).getDaysOfTravel() <= 500000 && ((TravelEntity) entity).getId() >= 0
				&& ((TravelEntity) entity).getId() <= 500000) {

			valid = true;
		} else {
			System.out.println(((TravelEntity) entity).getId());
			System.out.println(((TravelEntity) entity).getEmailId());
			System.out.println(((TravelEntity) entity).getPassword());
			System.out.println(((TravelEntity) entity).getMobileNo());
			System.out.println(((TravelEntity) entity).getAge());
			System.out.println(((TravelEntity) entity).getCost());
			System.out.println(((TravelEntity) entity).getCountry());
			System.out.println("---------------------------------------");
			System.out.println(((TravelEntity) entity).getCreatedBy());
			System.out.println(((TravelEntity) entity).getDaysOfTravel());
			System.out.println(((TravelEntity) entity).getNoOfBranches());
			System.out.println(((TravelEntity) entity).getNoOfTravellers());

			valid = true;
			return valid;
		}
		if (valid) {
			daoSTravelDAO.saveAll(entity);
		}
		return false;

	}

}
