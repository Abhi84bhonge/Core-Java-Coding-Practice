package com.Criteria;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class OrderBy3 {
	public static void main(String[] args) {
		
	Configuration cfg = new Configuration()
	        .configure("hibernate.cfg.xml")
	        .addAnnotatedClass(Automobile.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
    Criteria ct=session.createCriteria(Automobile.class);
   
    ct.setProjection(Projections.projectionList().add(Projections.property("brand"))
    		.add(Projections.property("price")));
    
    ct.addOrder(Order.desc("price"));
    List<Object[]> ot=ct.list();
    for (Object[] object : ot) {
		System.out.println(object[0]+" "+object[1]);
	}
	
   session.beginTransaction().commit();
	session.close();
	sf.close();
}
}
