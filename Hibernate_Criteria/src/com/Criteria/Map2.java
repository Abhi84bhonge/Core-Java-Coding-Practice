package com.Criteria;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class Map2 {
//	+----+--------------+---------------+----------+
//	| id | brand        | model         | price    |
//	+----+--------------+---------------+----------+
//	|  1 | Toyota       | Innova Crysta |  2355154 |
//	|  2 | Hyundai      | Creta         |  1073000 |
//	|  3 | Hyundai      | Venue         |   800000 |
//	|  4 | MercedesBenz | C             |  6900000 |
//	|  5 | MercedesBenz | S             | 17800000 |
//	|  6 | BMW          | X1            |  6008000 |
//	|  7 | BMW          | X2            |  4500000 |
//	+----+--------------+---------------+----------

	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Automobile.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();

			Criteria ct = session.createCriteria(Automobile.class);
			

			int page = 3;
			int pagesize = 7;
            ct.setFirstResult(page);
            ct.setMaxResults(pagesize);
            ct.addOrder(Order.asc("brand"));
            List<Automobile> lt=ct.list();
            
            for(Automobile at: lt) {
            	
            	System.out.println(at);
            }
			
			
//		for(Automobile am: lt) {
//			hmap.put(am.getId(), am);
//		}
//		
//		Automobile a=hmap.get(3);
//		
//		    System.out.println(a.getId() + " " + a.getBrand() + " " + a.getModel() + " " + a.getPrice());

			session.clear();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}