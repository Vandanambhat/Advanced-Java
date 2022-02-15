package com.xworkz.injection_spring.passport.daoORrepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.injection_spring.passport.entity.PassportEntity;
import com.xworkz.singleton.EMFsingletonUtil;

public class PassportRepositaryImpl implements PassportRepository {

	@Override
	public void save(PassportEntity entity) {

		EntityManagerFactory emf = EMFsingletonUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {
			entityManager.persist(entity);
			entityTransaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityTransaction.rollback();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
}
