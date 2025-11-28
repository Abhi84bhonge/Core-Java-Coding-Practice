package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Projection2 {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(Automobile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
//		Criteria ct=session.createCriteria(Automobile.class);
//		ct.setProjection(Projections.property("brand"));
//		
//		List<String >str=ct.list();
//		for (String string : str) {
//			System.out.println(string);
//		}
//		Criteria ct=session.createCriteria(Automobile.class);
//		ct.setProjection(Projections.property("model"));
//		
//		List<String> lt=ct.list();
//		for (String string : lt) {
//			System.out.println(string);
//		}
		
		Criteria ct=session.createCriteria(Automobile.class);
		ct.setProjection(Projections.projectionList().add(Projections.property("id")).add(Projections.property("brand"))
		.add(Projections.property("model")).add(Projections.property("price")));
		List<Automobile[]>lt=ct.list();
		for(Object[] rr:lt) {
			System.out.println(rr[0]+" "+rr[1]+" "+rr[2]+" "+rr[3]);
		}
		
		session.beginTransaction().commit();
		session.close();
		sf.close();
}
}