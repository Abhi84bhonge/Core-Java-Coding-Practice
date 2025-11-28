package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class Task3 {
	public static void main(String[] args) {
		try {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Automobile.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		Criteria ct=session.createCriteria(Automobile.class);
		ct.setProjection(Projections.max("price"));
		double maxprice=(double) ct.uniqueResult();
		System.out.println("Maximum price "+maxprice);
		Criteria ct1=session.createCriteria(Automobile.class);
		ct1.setProjection(Projections.min("price"));
		double minprice=(double)ct1.uniqueResult();
		System.out.println("min price "+minprice);
		Criteria ct2=session.createCriteria(Automobile.class);
		ct2.setProjection(Projections.avg("price"));
		double avgprice=(double)ct2.uniqueResult();
		System.out.println("average price "+avgprice);
		
		
		session.beginTransaction().commit();
	   session.clear();
		session.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
