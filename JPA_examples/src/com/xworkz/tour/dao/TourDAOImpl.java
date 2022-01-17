package com.xworkz.tour.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.hibernate.Transaction;

import com.xworkz.tour.entity.TourEntity;
import com.xworkz.tour.utility.EMFUtil;

public class TourDAOImpl implements TourDAO {

	public void put(TourEntity entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		int flushCount = 0;
		try {
			for (int i = 0; i < 20; i++) {
				if (flushCount == 5) {
					entityManager.flush();
					flushCount = 0;
					entityManager.clear();
				}
				entityManager.flush();
				flushCount++;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
			tx.rollback();
		}

		tx.commit();
	}

	public void putAll(List<TourEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (TourEntity tourEntity : entities) {
			manager.persist(tourEntity);

			EntityTransaction tx = manager.getTransaction();

			tx.begin();

			int flushCount = 0;
			try {
				for (int i = 0; i < 20; i++) {
					if (flushCount == 5) {
						manager.flush();
						flushCount = 0;
						manager.clear();
					}
					manager.flush();
					flushCount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				tx.rollback();
			}

			tx.commit();
		}
	}
}
