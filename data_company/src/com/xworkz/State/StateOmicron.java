package com.xworkz.State;

import com.xworkz.State.dao.StateDAO;
import com.xworkz.State.dao.StateDAOImpl;
import com.xworkz.State.entity.StateEntity;

public class StateOmicron {

	public static void main(String[] args) {
		StateEntity stateEntity1 = new StateEntity(8,"scotland", 34, "54.5 lakhs");
		StateEntity stateEntity2= new StateEntity(9,"singapore", 23, "56.9 lakhs");
		StateEntity stateEntity3= new StateEntity(10,"switzerland", 15, "86.4 lakhs");
		StateEntity stateEntity4= new StateEntity(11,"switzerland", 15, "86.4 lakhs");
		StateEntity stateEntity5=new StateEntity(12, "singapore", 23, "56.9 lakhs")	;
		StateDAO dao = new StateDAOImpl();
		dao.create(stateEntity1);
		dao.create(stateEntity2);
		dao.create(stateEntity3);
		dao.create(stateEntity4);
		dao.create(stateEntity5);
		

	}

}
