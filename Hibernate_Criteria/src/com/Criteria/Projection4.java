package com.Criteria;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Projection4 {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration()
		        .configure("hibernate.cfg.xml")
		        .addAnnotatedClass(Automobile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria ct=session.createCriteria(Automobile.class);
//		ct.add(Restrictions.eq("brand", "mercedesbenz"));
		ct.add(Restrictions.gt("price", 300000.0));
		ct.addOrder(Order.asc("brand"));
		ct.setProjection(Projections.projectionList().add(Projections.property("id"))
				.add(Projections.property("brand"))
				.add(Projections.property("price"))
				);
		
		List<Object[]>rows=ct.list();
		for (Object[] row : rows) {
		    System.out.println("id=" + row[0] + " brand=" + row[1] + " price=" + row[2]);		}
		session.beginTransaction().commit();
		session.close();
		sf.close();
}
}