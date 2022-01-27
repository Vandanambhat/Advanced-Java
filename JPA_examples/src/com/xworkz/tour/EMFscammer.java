package com.xworkz.tour;

import javax.persistence.EntityManager;

import com.xworkz.singleton.EMFsingletonUtil;

public class EMFscammer {

	public static void main(String[] args) {
		
		EntityManager refEntityManager=EMFsingletonUtil.getEntityManagerFactory().createEntityManager();
		System.out.println(refEntityManager);

	}

}
