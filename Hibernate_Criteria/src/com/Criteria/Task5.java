package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

public class Task5 {
	public static void main(String[] args) {
		try {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Automobile.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		
		Criteria ct=session.createCriteria(Automobile.class);
		ct.addOrder(Order.asc("price"));
		List<Automobile> lt=ct.list();
		for (Automobile automobile : lt) {
			System.out.println(automobile);
		}
		
		
		session.beginTransaction().commit();
	   session.clear();
		session.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
