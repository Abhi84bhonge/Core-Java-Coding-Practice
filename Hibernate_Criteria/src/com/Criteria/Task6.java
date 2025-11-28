package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class Task6 {

	public static void main(String[] args) {
		try {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Automobile.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		
		int page=0;
		int pagesize=7;
		
		Criteria ct=session.createCriteria(Automobile.class);
		ct.setFirstResult(page);
		ct.setMaxResults(pagesize);
		
		List<Automobile> lt=ct.list();
		for(Automobile at: lt) {
			System.out.println(at.getId()+" "+at.getBrand()+" "+at.getModel()+" "+at.getPrice());
		}
		session.beginTransaction().commit();
	   session.clear();
		session.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
