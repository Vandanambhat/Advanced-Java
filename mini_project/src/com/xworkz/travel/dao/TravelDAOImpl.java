package com.xworkz.travel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.singleton.EMFsingletonUtil;
import com.xworkz.travel.entity.TravelEntity;
import com.xworkz.travel.utility.EMFUtil;

public class TravelDAOImpl implements TravelDAO {

	@Override
	public void saveAll(List<TravelEntity> entity) {
		EntityManagerFactory emf = EMFsingletonUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		int flushCount = 0;
		try {
			for (TravelEntity travelEntity : entity) {
				entityManager.persist(travelEntity);

				if (flushCount == 5) {
					entityManager.flush();
					flushCount = 0;
					entityManager.clear();
				}
				flushCount++;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
			tx.rollback();
		}

		tx.commit();

	}

}
