package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Restriction7 {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(Automobile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria ct=session.createCriteria(Automobile.class);
		ct.add(Restrictions.eq("brand", "mercedesbenz"));
		ct.setProjection(Projections.projectionList().add(Projections.property("id"))
				.add(Projections.property("brand"))
				.add(Projections.property("model")));
		List<Object[]>lt=ct.list();
		for (Object[] objects : lt) {
			System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
		}
//		ct.add(Restrictions.eq("model", "creta"));
//		ct.add(Restrictions.eq("price", 1073000.0));
//		List<Automobile> lt=ct.list();
//		for (Automobile a : lt) {
//			System.out.println(a);
//		}
//		session.beginTransaction().commit();
//		session.close();
//		sf.close();
}}
