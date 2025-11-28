package com.Criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class OrderBy2 {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(Automobile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria ct=session.createCriteria(Automobile.class);
		ct.addOrder(Order.desc("brand"));
		
		List<Automobile> lt=ct.list();
		for (Automobile a : lt) {
			System.out.println(a);
		}
		session.beginTransaction().commit();
		session.close();
		sf.close();
}
}
