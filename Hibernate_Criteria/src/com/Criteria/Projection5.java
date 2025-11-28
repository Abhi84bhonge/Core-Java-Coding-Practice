package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class Projection5 {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(Automobile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria ct=session.createCriteria(Automobile.class);
		ct.setProjection(Projections.avg("price"));
		List<Double> lt=ct.list();
		for (Double double1 : lt) {
			System.out.println(double1);
		}
//		List<Double> dt=ct.list();
//		for (Double double1 : dt) {
//			System.out.println(double1);
//		}
		session.beginTransaction().commit();
		session.close();
		sf.close();
}

}
