package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Projection3_SecondMax {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(Automobile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
//		Criteria ct=session.createCriteria(Automobile.class);
//		ct.setProjection(Projections.max("price"));
//		List<Double> lt=ct.list();
//		for (Double double1 : lt) {
//			System.out.println(double1);
//		}
		
		Criteria ct=session.createCriteria(Automobile.class);
		ct.setProjection(Projections.max("price"));
		double maxprice=(double) ct.uniqueResult();
		 
		
		ct.add(Restrictions.lt("price", maxprice));
		ct.setProjection(Projections.max("price"));
		double secmax=(double)ct.uniqueResult();
		System.out.println("second max "+secmax);
		
		session.beginTransaction().commit();
		session.close();
		sf.close();
}
}