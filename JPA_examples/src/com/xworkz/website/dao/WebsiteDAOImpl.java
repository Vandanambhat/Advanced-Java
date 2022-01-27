package com.xworkz.website.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.tour.utility.EMFUtil;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO{

	@Override
	public void save(WebsiteEntity entity) {
		System.out.println(entity);
		EntityManagerFactory emf=EMFUtil.getEntityManagerFactory();
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		entityManager.persist(entity);
		tx.commit();
		
	}

	@Override
	public WebsiteEntity getByName() {

		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByName");

			Object result = query.getSingleResult();

			WebsiteEntity entity = (WebsiteEntity) result;

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public WebsiteEntity getByLike() {

		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getByLikeURLX");

			Object result = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) result;

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getMinvalue() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getMinSince");

			Object object = query.getSingleResult();
         Object[] entity=(Object[])object;
         System.out.println(entity[0]);
         System.out.println(entity[1]);

         return (WebsiteEntity)entity[0];
        
         
         
		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public WebsiteEntity getMaxValue() {
          EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
          
          try {
        	 Query query= manager.createNamedQuery("getmaxSince");
        	  Object result=query.getSingleResult();
        	  Object[] entity=(Object[])result;
        	  System.out.println(entity[0]);
        	  System.out.println(entity[1]);

        	  
        	  return (WebsiteEntity)entity[0];
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	
}
