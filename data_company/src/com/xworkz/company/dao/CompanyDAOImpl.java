package com.xworkz.company.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity entity) {
		System.out.println("Invoked create in DAO");
		System.out.println(entity);

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CompanyEntity.class);
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
