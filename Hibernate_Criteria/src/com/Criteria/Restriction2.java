package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Restriction2 {
	
	
	public static void main(String[] args) {
		
	Configuration cfg = new Configuration()
	        .configure("hibernate.cfg.xml")
	        .addAnnotatedClass(Automobile.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Criteria ct=session.createCriteria(Automobile.class);
//	For all cars see
	List<Automobile> lt=ct.list();
	for (Automobile automobile : lt) {
		System.out.println(automobile);
	}
//	 Criteria ct=session.createCriteria(Automobile.class);
//	  ct.add(Restrictions.eqOrIsNull("brand", "Toyota"));
//	  List<Automobile> lt=ct.list();
//	  for (Automobile a : lt) {
//		System.out.println(a);
//	}
	
	session.beginTransaction().commit();
	session.close();
	sf.close();
}
}