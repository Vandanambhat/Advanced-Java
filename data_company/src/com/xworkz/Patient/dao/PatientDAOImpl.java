package com.xworkz.Patient.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Patient.entity.PatientEntity;

public class PatientDAOImpl implements PatientDAO{

	@Override
	public void create(PatientEntity entity) {
		System.out.println("Invoked create in DAO");
		System.out.println(entity);

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(PatientEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(entity);
			tx.commit();
			session.close();
		}
		factory.close();
		
	}
}
