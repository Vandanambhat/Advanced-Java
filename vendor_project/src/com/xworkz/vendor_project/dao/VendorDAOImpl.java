package com.xworkz.vendor_project.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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
		tx.commit();

	}

	@Override
	public boolean findLogin(String loginName, String password) {
		EntityManagerFactory emf = EMFsingletonUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
//		EntityTransaction tx = entityManager.getTransaction();
//		tx.begin();

		try {
			Query query = entityManager.createNamedQuery("findLogin");
			query.setParameter("ln", loginName);
			query.setParameter("pwd", password);
			Object result = query.getSingleResult();
			VendorEntity entity = (VendorEntity) result;
			if (result != null) {
				return true;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean findByEmail(String email) {
		EntityManagerFactory emf = EMFsingletonUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
//		EntityTransaction tx = entityManager.getTransaction();
//		tx.begin();

		try {
			Query query = entityManager.createNamedQuery("findByEmail");
			query.setParameter("em", email);

			Object result = query.getSingleResult();
			
			if (result != null) {
				VendorEntity entity = (VendorEntity) result;
				return true;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return false;
	}

	@Override
	public void updatePasswordByEmail(String email, String pwd) {
		EntityManagerFactory emf = EMFsingletonUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		try {
			Query query = entityManager.createNamedQuery("updatePasswordByEmail");
			query.setParameter("mail", email);// query.setParameter(name, value);
			query.setParameter("pw", pwd);
			Object result = query.executeUpdate();
			System.out.println(result);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

	}
}
