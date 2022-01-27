package com.xworkz.registration_project.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.registration_project.entity.RegisterEntity;
import com.xworkz.singleton.EMFsingletonUtil;

public class RegisterDAOImpl implements RegisterDAO {

	@Override
	public void save(RegisterEntity entity) {
		EntityManagerFactory emf = EMFsingletonUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {

			entityManager.persist(entity);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

}
