package com.xworkz.vendor_project.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.singleton.EMFsingletonUtil;
import com.xworkz.vendor_project.entity.VendorEntity;

public class VendorDAOImpl implements VendorDAO {

	@Override
	public void save(VendorEntity entity) {

		EntityManagerFactory emf = EMFsingletonUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(entity);
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
