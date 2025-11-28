package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Projection1 {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(Automobile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
//		Criteria ct=session.createCriteria(Automobile.class);
//		 ct.setProjection(Projections.property("model"));
//		 List<String >lt=ct.list();
//		 for (String string : lt) {
//			System.out.println(string);
//		}
		
//		Criteria ct=session.createCriteria(Automobile.class);
//		ct.setProjection(Projections.sum("price"));
//		List<Double> lt=ct.list();
//		for (Double double1 : lt) {
//			System.out.println(double1);
//		}
		Criteria ct=session.createCriteria(Automobile.class);
		ct.add(Restrictions.eq("brand", "mercedesbenz"));
		ct.setProjection(Projections.projectionList()
				
				.add(Projections.property("id"))
				.add(Projections.property("brand"))
				.add(Projections.property("model"))
				.add(Projections.property("price"))
		);
		List<Object[]> obj=ct.list();
		for (Object[] objects : obj) {
			System.out.println(objects[0]+" "+objects[1]+" "+objects[2]+" "+objects[3]);
		}
		session.beginTransaction().commit();
		session.close();
		sf.close();
}
}