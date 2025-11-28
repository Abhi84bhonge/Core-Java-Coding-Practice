package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Task1 {

	public static void main(String[] args) {
		try {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Automobile.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		
//		Criteria ct=session.createCriteria(Automobile.class);
//		ct.add(Restrictions.between("price", 50000.0, 1000000.));
//		List<Automobile> lt=ct.list();
//		for (Automobile automobile : lt) {
//			System.out.println(automobile);
//		}
		
		Criteria ct=session.createCriteria(Automobile.class);
		ct.add(Restrictions.like("model", "s%"));
		List<Automobile> lt=ct.list();
		for (Automobile a : lt) {
			System.out.println(a);
		}
		
		
		session.beginTransaction().commit();
		session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
