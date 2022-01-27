package com.xworkz.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFsingletonUtil {
	

		private static EntityManagerFactory entityManagerFactory;

		public static EntityManagerFactory getEntityManagerFactory() {
			return entityManagerFactory;
		}

		static {
			entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

		}

	}

