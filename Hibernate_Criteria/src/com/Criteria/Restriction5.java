package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Restriction5 {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(Automobile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
//		Criteria ct=session.createCriteria(Automobile.class);
//		ct.add(Restrictions.lt("price", 800000.0));
//		List<Automobile> lt=ct.list();
//		for (Automobile a : lt) {
//			System.out.println(a);
//		}
		Criteria ct=session.createCriteria(Automobile.class);
		ct.add(Restrictions.lt("price", 7000000.0));
		List<Automobile> lt=ct.list();
		for (Automobile au : lt) {
			System.out.println(au);
		}
		session.beginTransaction().commit();
		session.close();
		sf.close();
}
}