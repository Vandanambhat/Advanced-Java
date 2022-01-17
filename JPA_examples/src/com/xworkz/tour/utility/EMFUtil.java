package com.xworkz.tour.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz.tour");

	}

}