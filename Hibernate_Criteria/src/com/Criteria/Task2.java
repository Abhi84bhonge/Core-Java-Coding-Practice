package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Task2 {
	public static void main(String[] args) {
		try {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Automobile.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		Criteria ct=session.createCriteria(Automobile.class);
		ct.setProjection(Projections.projectionList().add(Projections.property("id"))
				.add(Projections.property("brand"))
				.add(Projections.property("price")));
		List<Object[]> lt=ct.list();
		for (Object[] objects : lt) {
			System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
		}
		
		
		
		session.beginTransaction().commit();
	   session.clear();
		session.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}