package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Task4 {
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
		
		ct.add(Restrictions.lt("price", maxprice));
		ct.setProjection(Projections.max("price"));
		double secmaxprice=(double)ct.uniqueResult();
		System.out.println("second max price "+secmaxprice);
		session.beginTransaction().commit();
	   session.clear();
		session.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
